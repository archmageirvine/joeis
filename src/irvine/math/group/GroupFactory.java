package irvine.math.group;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import irvine.math.api.Group;
import irvine.math.set.FiniteSet;
import irvine.math.set.Permutation;
import irvine.util.io.IOUtils;

/**
 * Construct a group by name.
 * @author Sean A. Irvine
 */
public final class GroupFactory {

  private GroupFactory() { }

  private static final HashMap<String, FiniteSet<Permutation<Integer>>> GENERATORS = new HashMap<>();

  private static int findMax(final String s) {
    int max = 0;
    for (final String t : s.replaceAll("[(\\[\\]]", "").split("[ ,;)]")) {
      if (!t.isEmpty()) {
        final int v = Integer.parseInt(t);
        if (v > max) {
          max = v;
        }
      }
    }
    return max;
  }

  /**
   * Convert string descriptions of a permutation or cycle index into permutations.
   * @param desc string description of permutation
   * @return the permutation
   */
  public static List<Permutation<Integer>> descriptionToPermutations(final String desc) {
    final ArrayList<Permutation<Integer>> values = new ArrayList<>();
    final int max = findMax(desc);
    for (final String d : desc.split(";")) {
      final int[] perm = new int[max];
      if (desc.charAt(0) == '(') {
        // We have generators specified by cycle index
        for (final String c : d.split("\\)")) {
          // We now have a single cycle, update permutation
          final String[] v = c.replaceAll("[()]", "").split("[ ,]");
          for (int k = 0; k < v.length; ++k) {
            final int vk = Integer.parseInt(v[k]) - 1;
            if (perm[vk] != 0) {
              throw new RuntimeException("Repeated element: " + vk + " in " + desc);
            }
            perm[vk] = Integer.parseInt(v[(k + 1) % v.length]);
          }
        }
        // Deal with remaining fixed points
        for (int k = 0; k < perm.length; ++k) {
          if (perm[k] == 0) {
            perm[k] = k + 1;
          }
        }
      } else if (desc.charAt(0) == '[') {
        // We have a directly specified permutation
        final String[] v = d.replaceAll("[\\[\\]]", "").split(",");
        for (int k = 0; k < v.length; ++k) {
          perm[k] = Integer.parseInt(v[k]);
        }
        final Permutation<Integer> p = Permutation.create(perm);
        values.add(p);
      } else {
        throw new UnsupportedOperationException(desc);
      }
      final Permutation<Integer> p = Permutation.create(perm);
      values.add(p);
    }
    return values;
  }

  static {
    try (final BufferedReader r = IOUtils.reader("irvine/math/group/resources/gens.dat")) {
      String line;
      while ((line = r.readLine()) != null) {
        if (!line.isEmpty() && line.charAt(0) != '#') {
          final int keySpace = line.indexOf(' ');
          final String key = line.substring(0, keySpace);
          final List<Permutation<Integer>> values = descriptionToPermutations(line.substring(keySpace + 1).trim());
          GENERATORS.put(key, new FiniteSet<>(values));
        }
      }
    } catch (final IOException e) {
      throw new RuntimeException(e);
    }
  }

  /**
   * Construct a group from its name.
   * @param name name of the group
   * @return the group
   */
  public static Group<?> createGroup(final String name) {
    final FiniteSet<Permutation<Integer>> gens = GENERATORS.get(name);
    if (gens != null) {
      final int order = gens.iterator().next().domain().size().intValueExact();
      return SymmetricGroup.create(order).generateSubgroup(gens);
    }
    final int product = name.indexOf('x');
    if (product >= 0) {
      return new DirectProduct<>(createGroup(name.substring(0, product)), createGroup(name.substring(product + 1)));
    } else if ("V".equals(name)) {
      return new KleinGroup();
    } else if (name.startsWith("Q")) {
      return new DicyclicGroup(Integer.parseInt(name.substring(1)) / 4);
    } else if (name.startsWith("Dic")) {
      return new DicyclicGroup(Integer.parseInt(name.substring(3)));
    } else if (name.startsWith("A")) {
      return AlternatingGroup.create(Integer.parseInt(name.substring(1)));
    } else if (name.startsWith("C") || name.startsWith("Z")) {
      return new CyclicGroup(Integer.parseInt(name.substring(1)));
    } else if (name.startsWith("D")) {
      return new DihedralGroup(Integer.parseInt(name.substring(1)));
    } else if (name.startsWith("SL")) {
      final int gf = name.indexOf("(GF");
      final int order = Integer.parseInt(name.substring(2, gf));
      final GaloisField f = new GaloisField(Integer.parseInt(name.substring(gf + 3, name.indexOf(')', gf + 3))));
      return new SpecialLinearGroup<>(order, f);
    } else if (name.startsWith("S")) {
      return SymmetricGroup.create(Integer.parseInt(name.substring(1)));
    }
    throw new UnsupportedOperationException("Unknown: " + name);
  }
}
