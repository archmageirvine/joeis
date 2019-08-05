package irvine.math.group;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

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
  public static AbstractGroup<?> createGroup(final String name) {
    final FiniteSet<Permutation<Integer>> gens = GENERATORS.get(name);
    if (gens != null) {
      final int order = gens.iterator().next().domain().size().intValueExact();
      return SymmetricGroup.create(order).generateSubgroup(gens);
    }
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
    }
    throw new UnsupportedOperationException("Unknown: " + name);
  }

  private static final String[][] SMALL_GROUPS = {
    {},
    {"C1"},
    {"C2"},
    {"C3"},
    {"C4", "V"},
    {"C5"},
    {"C6", "S3"},
    {"C7"},
    {"C8", "Q8", "D4", "Z4xZ2", "Z2xZ2xZ2"},
    {"C9", "Z3xZ3"},
    {"C10", "D5"},
    {"C11"},
    {"C12", "Z6xZ2", "D6", "A4", "Dic3"},
    {"C13"},
    {"C14", "D7"},
    {"C15"},
    {"C16", "D8", "Z8xZ2", "Dic4", "Z2xZ2xZ2xZ2", "Z4xZ4", "Z4xZ2xZ2", "D4xZ2", "Q8xZ2", "C4oD4", "M4(2)", "SD16", "V:C4", "C4:C4"},
    {"C17"},
    {"C18", "D9", "Z6xZ3", "S3xZ3", "C3:S3"},
    {"C19"},
    {"C20", "D10", "Z10xZ2", "Dic5", "Sz(2)"},
    {"C21", "C7:C3"},
    {"C22", "D11"},
    {"C23"},
    {"C24", "D12", "Z12xZ2", "Dic6", "S4", "Z6xZ2xZ2", "S3xZ2xZ2", "A4xZ2", "Dic3xZ2", "S3xC4", "D4xC3", "Q8xC3", "C8:C3", "D4:C3", "Q8:C3"},
    {"C25", "C5xC5"},
    {"C26", "D13"},
    {"C27", "C9xC3", "C3xC3xC3", "He3", "C9:C3"},
    {"C28", "D14", "Dic7", "C14xC2"},
    {"C29"},
    {"C30", "D15", "D5xC3", "S3xC5"},
    {"C31"},
    {"C32", "D16", "Dic8", "SD32", "M5(2)", "D4oD4", "D4oQ8", "C4wrC2", "VwrC2", "C8oD4", "C4oD8", "C8:V", "C4:D4", "D4:C4", "C4:1D4", "C2^3:C4", "V:C8", "V:Q8", "C4^2:C2", "C4^2:2C2", "C4:C8", "C4:Q8", "C8:C4", "Q8:C4", "C4.D4", "C8.C4", "C4.4D4", "C8.V", "C4.10D4", "V.D4", "C2.D8", "C4.Q8", "C2.C4^2", "C4^2.C2", "Z2xZ2xZ2xZ2xZ2", "C4xC8", "C2xC16", "C2xC4xC4", "C2xC2xC8", "C2xC2xC2xC4", "C4xD4", "C2xD8", "C2xSD16", "Z2xZ2xD4", "C2xM4(2)", "C4xQ8", "C2xDic4", "Z2xZ2xQ8", "C2xC4oD4", "C2xV:C4", "C2xC4:C4"},
    {"C33"},
    {"C34", "D17"},
    {"C35"},
    {"C36", "D18", "Dic9", "C6xC6", "C2xC18", "C3xC12", "C6xS3", "S3xS3", "C3xDic3", "C3xA4", "C3^2:C4", "C3:Dic3", "C3.A4", "C2xC3:S3"},
    {"C37"},
    {"C38", "D19"},
    {"C39", "C13:C3"},
    {"C40", "D20", "Dic10", "C5:D4", "C5:C8", "C5:2C8", "C2xC20", "C2xC2xC10", "C2xSz(2)", "C4xD5", "C5xD4", "C2xC2xD5", "C5xQ8", "C2xDic5"},
    {"C41"},
    {"C42", "D21", "F7", "S3xC7", "C3xD7", "C2xC7:C3"},
    {"C43"},
    {"C44", "D22", "Dic11", "C2xC22"},
    {"C45", "C3xC15"},
    {"C46", "D23"},
    {"C47"},
    {"C48", "D24", "Dic12", "Q8:S3", "Q8.S3", "C4oD12", "A4:C4", "C4xC4:C3", "C2xC2:A4", "D6:C4", "D4:S3", "C8:S3", "C24:C2", "D4:2S3", "Q8:2S3", "Q8:3S3", "C3:C16", "C4:Dic3", "C3:Q16", "Dic3:C4", "C4.A4", "D4.S3", "C4.Dic3", "C6.D4", "C4xC12", "C2xC24", "C2xC2xC2xC6", "C2xC2xC12", "C2xS4", "C4xA4", "S3xD4", "C2xC2xA4", "C2x(Q8:C3)", "S3xC8", "C3xD8", "C6xD4", "S3xQ8", "C2xD12", "S3xC2xC2xC2", "C3xSD16", "C3xM4(2)", "C6xQ8", "C3xQ16", "C4xDic3", "C2xDic6", "C2xC2xDic3", "S3xC2xC4", "C2xC3:D4", "C3xC4oD4", "C3xC2xC2:C4", "C2xC3:C8", "C3xC4:C4"},
    {"C49", "C7xC7"},
    {"C50", "D25", "C5:D5", "C5xC10", "C5xD5"},
    {"C51"},
    {"C52", "D26", "Dic13", "C13:C4", "C2xC26"},
    {"C53"},
    {"C54", "D27", "C9:C6", "C3xC3:C6", "He3:C2", "C9:S3", "C3xC3xC3:C2", "C3xC18", "C3xC3xC6", "S3xC9", "C3xD9", "C2xHe3", "S3xC3xC3", "C2x(C9:C3)", "C3xC3:S3"},
    {"C55", "C11:C5"},
    {"C56", "D28", "Dic14", "F8", "C7:D4", "C7:C8", "C2xC28", "C2xC2xC14", "C4xD7", "C7xD4", "C2xC2xD7", "C7xQ8", "C2xDic7"},
    {"C57", "C19:C3"},
    {"C58", "D29"},
    {"C59"},
    {"C60", "D30", "Dic15", "A5", "C3:F5", "C2xC30", "S3xD5", "C3xSz(2)", "C5xA4", "C6xD5", "S3xC10", "C5xDic3", "C3xDic5"},
  };

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
    if (order >= SMALL_GROUPS.length) {
      throw new UnsupportedOperationException();
    }
    return SMALL_GROUPS[order];
  }

}
