package irvine.math.group;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

import irvine.math.api.Group;
import irvine.math.set.FiniteSet;
import irvine.math.set.Permutation;
import irvine.math.z.Z;
import irvine.util.io.IOUtils;

/**
 * Construct a group by name.
 * @author Sean A. Irvine
 */
public final class GroupFactory {

  private GroupFactory() { }

  private static final HashMap<String, Integer> NAME_TO_ORDER = new HashMap<>();

  private static int findMax(final String s) {
    int max = 1;
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
            if (v[k].isEmpty()) {
              continue; // deal with "()"
            }
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
    try (final BufferedReader r = IOUtils.reader("irvine/math/group/resources/names-order.dat.gz")) {
      String line;
      while ((line = r.readLine()) != null) {
        if (!line.isEmpty() && line.charAt(0) != '#') {
          final int keySpace = line.indexOf('\t');
          final String key = line.substring(0, keySpace);
          final Integer order = Integer.valueOf(line.substring(keySpace + 1));
          NAME_TO_ORDER.put(key, order);
        }
      }
    } catch (final IOException e) {
      throw new RuntimeException(e);
    }
  }

  private static final HashMap<String, Group<?>> GROUP_CACHE = new HashMap<>();

  private static Group<?> createGroup(final String name, final int order) {
    final Group<?> g = GROUP_CACHE.get(name);
    if (g != null) {
      return g;
    }
    final String nameTab = name + "\t";
    try (final BufferedReader r = IOUtils.reader("irvine/math/group/resources/sg" + order + ".dat.gz")) {
      String line;
      while ((line = r.readLine()) != null) {
        if (line.startsWith(nameTab)) {
          final String[] parts = line.split("\t");
          final List<Permutation<Integer>> values = descriptionToPermutations(parts[1]);
          final FiniteSet<Permutation<Integer>> gens = new FiniteSet<>(values);
          final int o = gens.iterator().next().domain().size().intValueExact();
          final AbstractGroup<?> res = SymmetricGroup.create(o).generateSubgroup(gens);
          res.setAutSize(new Z(parts[2]));
          GROUP_CACHE.put(name, res);
          return res;
        }
      }
    } catch (final IOException e) {
      throw new UnsupportedOperationException(e);
    }
    throw new UnsupportedOperationException("Could not construct " + name);
  }

  /**
   * Construct a group from its name.
   * @param name name of the group
   * @return the group
   */
  public static Group<?> createGroup(final String name) {
    if (name.startsWith("(") && name.endsWith(")")) {
      return createGroup(name.substring(1, name.length() - 1));
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
    } else if (name.startsWith("GL")) {
      final int gf = name.indexOf("(GF");
      final int order = Integer.parseInt(name.substring(2, gf));
      final GaloisField f = new GaloisField(Integer.parseInt(name.substring(gf + 3, name.indexOf(')', gf + 3))));
      return new GeneralLinearGroup<>(order, f);
    } else if (name.startsWith("S")) {
      return SymmetricGroup.create(Integer.parseInt(name.substring(1)));
    } else {
      final Integer order = NAME_TO_ORDER.get(name);
      if (order != null) {
        return createGroup(name, order);
      }
    }
    throw new UnsupportedOperationException("Unknown: " + name);
  }

  /**
   * Return the names of all groups of the given order.  These names are suitable for use with
   * the <code>createGroup()</code> method.
   * @param order order of groups
   * @return names of groups
   */
  public static String[] smallGroupNames(final int order) {
    if (order < 1) {
      throw new IllegalArgumentException();
    }
    final ArrayList<String> res = new ArrayList<>();
    try (final BufferedReader r = IOUtils.reader("irvine/math/group/resources/sg" + order + ".dat.gz")) {
      String line;
      while ((line = r.readLine()) != null) {
        final String[] parts = line.split("\t");
        res.add(parts[0]);
      }
    } catch (final IOException e) {
      throw new UnsupportedOperationException(e);
    }
    return res.toArray(new String[0]);
  }

  /**
   * Return all the small (permutation) groups of the specified order.
   * @param order order
   * @return groups
   */
  public static List<Group<?>> smallGroups(final int order) {
    if (order <= 0) {
      if (order == 0) {
        return Collections.emptyList();
      }
      throw new IllegalArgumentException();
    }
    final ArrayList<Group<?>> res = new ArrayList<>();
    try (final BufferedReader r = IOUtils.reader("irvine/math/group/resources/sg" + order + ".dat.gz")) {
      String line;
      while ((line = r.readLine()) != null) {
        if (!line.isEmpty() && line.charAt(0) != '#') {
          final String[] parts = line.split("\t");
          final List<Permutation<Integer>> values = descriptionToPermutations(parts[1]);
          final FiniteSet<Permutation<Integer>> gens = new FiniteSet<>(values);
          final int o = gens.iterator().next().domain().size().intValueExact();
          final AbstractGroup<?> g = SymmetricGroup.create(o).generateSubgroup(gens);
          g.setAutSize(new Z(parts[2]));
          res.add(g);
        }
      }
    } catch (final IOException e) {
      throw new UnsupportedOperationException(e);
    }
    return res;
  }
}
