package irvine.math.group;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import irvine.math.api.Group;
import irvine.math.factorial.MemoryFactorial;
import irvine.math.polynomial.CycleIndex;
import irvine.math.q.Q;
import irvine.math.set.FiniteSet;
import irvine.math.set.Permutation;

/**
 * Make plots of groups
 * @author Sean A. Irvine
 */
public final class GroupGraphs {

  private GroupGraphs() { }

  private static <T> String node(final String label, final T p) {
    return label + "n" + p.toString().replace(", ", "_").replace("[", "").replace("]", "");
  }

  private static void makeGraph(final Group<Permutation<Integer>> group, final Permutation<Integer> a, final Permutation<Integer> b) {
    System.out.println("digraph {");
    System.out.println("node [shape=circle,style=filled,fillcolor=black,fixedsize=true,width=0.05,label=\"\"]");
    for (final Permutation<Integer> e : group) {
      final String n = node("", e);
      final String na = node("", group.add(e, a));
      if (na.compareTo(n) <= 0) {
        // a^2 = 1, hence this cuts down the number of edges needed in the plot by replacing the two
        // directed edges between n and na with a single undirected edge
        System.out.println(n + "->" + na + " [color=red,dir=none]");
      }
      System.out.println(n + "->" + node("", group.add(e, b)) + " [color=blue]");
    }
    System.out.println('}');
  }

  private static final String[] COLOURS = {"red", "blue", "green", "magenta", "cyan", "gray", "black", "orange"};

  private static <T> void makeGraph(final PrintStream out, final Group<T> group, final List<T> gens, final String label) {
    out.println("digraph " + label + " {");
    out.println("start=42;"); // Deterministic seed
    out.println("node [shape=circle,style=filled,fillcolor=black,fixedsize=true,width=0.05,label=\"\"]");
    // Explicitly code nodes (needed for trivial group)
    for (final T e : group) {
      out.println(node(label, e));
    }
    // Now run through the generators
    for (final T e : group) {
      final String n = node(label, e);
      for (int k = 0; k < gens.size(); ++k) {
        out.println(n + "->" + node(label, group.add(e, gens.get(k))) + " [color=" + COLOURS[k % COLOURS.length] + "]");
      }
    }
    out.println('}');
  }

  private static List<Permutation<Integer>> makeGeneratorsForSymmetricGroup(final int n) {
    assert n >= 3;
    final ArrayList<Permutation<Integer>> gens = new ArrayList<>();
    final int m = MemoryFactorial.SINGLETON.factorial(n).intValueExact();
    for (int k = 1; k < n; ++k) {
      final int[] p = new int[m];
      for (int j = 0; j < m; ++j) {
        p[j] = j + 1;
      }
      p[k] = k;
      p[k - 1] = k + 1;
      gens.add(Permutation.create(p));
    }
    return gens;
  }

  private static void makeAll() throws FileNotFoundException {
    for (int order = 1; order < GENERATORS_SMALL_GROUPS.length; ++order) {
      final SymmetricGroup<Integer> z = SymmetricGroup.create(order);
      final List<Permutation<Integer>>[] gens = GENERATORS_SMALL_GROUPS[order];
      for (int group = 0; group < gens.length; ++group) {
        final String label = "g" + order + "_" + group;
        final Group<Permutation<Integer>> g = z.generateSubgroup(new FiniteSet<>(gens[group]));
        try (final PrintStream out = new PrintStream(new FileOutputStream(label + ".dot"))) {
          makeGraph(out, g, gens[group], label);
        }
      }
    }
  }

  // Any group of order n is a subgroup of S_n (of order n!)
  @SuppressWarnings("unchecked")
  private static final List<Permutation<Integer>>[][] GENERATORS_SMALL_GROUPS = (List<Permutation<Integer>>[][]) new List<?>[][] {
    {},
    {Collections.singletonList(Permutation.create(1))},  // Z_1
    {Collections.singletonList(Permutation.create(2, 1))}, // Z_2
    {Collections.singletonList(Permutation.create(2, 3, 1))},  // Z_3
    {
      Collections.singletonList(Permutation.create(2, 3, 4, 1)),  // Z_4
      Arrays.asList(Permutation.create(2, 1, 4, 3), Permutation.create(3, 4, 1, 2)) // V
    },
    {Collections.singletonList(Permutation.create(2, 3, 4, 5, 1))},  // Z_5
    {
      Collections.singletonList(Permutation.create(2, 3, 4, 5, 6, 1)), // Z_6
      Arrays.asList(Permutation.create(2, 1, 3, 4, 5, 6), Permutation.create(3, 2, 1, 4, 5, 6)), // S_3
    },
    {Collections.singletonList(Permutation.create(2, 3, 4, 5, 6, 7, 1))},  // Z_7
    {
      Collections.singletonList(Permutation.create(2, 3, 4, 5, 6, 7, 8, 1)), // Z_8
      Arrays.asList(Permutation.create(2, 4, 6, 7, 3, 8, 1, 5), Permutation.create(3, 5, 4, 8, 7, 2, 6, 1)), // Q_8
      Arrays.asList(Permutation.create(2, 3, 4, 1, 5, 6, 7, 8), Permutation.create(3, 2, 1, 4, 5, 6, 7, 8)), // D_4
      Arrays.asList(Permutation.create(2, 3, 4, 1, 5, 6, 7, 8), Permutation.create(1, 2, 3, 4, 6, 5, 7, 8)),  // Z_4 x Z_2
      Arrays.asList(Permutation.create(2, 1, 3, 4, 5, 6, 7, 8), Permutation.create(1, 2, 4, 3, 5, 6, 7, 8), Permutation.create(1, 2, 3, 4, 6, 5, 7, 8)),  // E_8 = Z_2 x Z_2 x Z_2
    },
    {
      Collections.singletonList(Permutation.create(2, 3, 4, 5, 6, 7, 8, 9, 1)), // Z_9
      Arrays.asList(Permutation.create(2, 3, 1, 4, 5, 6, 7, 8, 9), Permutation.create(1, 2, 3, 5, 6, 4, 7, 8, 9)),  // Z_3 x Z_3
    },
    {
      Collections.singletonList(Permutation.create(2, 3, 4, 5, 6, 7, 8, 9, 10, 1)), // Z_10
      Arrays.asList(Permutation.create(2, 3, 4, 5, 1, 6, 7, 8, 9, 10), Permutation.create(5, 4, 3, 2, 1, 6, 7, 8, 9, 10)),  // D_5
    },
    {Collections.singletonList(Permutation.create(2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 1))},  // Z_11
    {
      Collections.singletonList(Permutation.create(2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 1)), // Z_12
      Arrays.asList(Permutation.create(2, 3, 4, 5, 6, 1, 7, 8, 9, 10, 11, 12), Permutation.create(1, 2, 3, 4, 5, 6, 8, 7, 9, 10, 11, 12)),  // Z_6 x Z_2
      Arrays.asList(Permutation.create(2, 3, 4, 5, 6, 1, 7, 8, 9, 10, 11, 12), Permutation.create(6, 5, 4, 3, 2, 1, 7, 8, 9, 10, 11, 12)),  // D_6
      Arrays.asList(Permutation.create(2, 3, 1, 4, 5, 6, 7, 8, 9, 10, 11, 12), Permutation.create(2, 1, 4, 3, 5, 6, 7, 8, 9, 10, 11, 12)),  // A_4
      Arrays.asList(Permutation.create(2, 3, 4, 5, 6, 1, 8, 9, 10, 11, 12, 7), Permutation.create(8, 7, 12, 11, 10, 9, 5, 4, 3, 2, 1, 6)),  // Dic_3
    },
    {Collections.singletonList(Permutation.create(2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 1))},  // Z_13
    {
      Collections.singletonList(Permutation.create(2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 1)), // Z_14
      Arrays.asList(Permutation.create(2, 3, 4, 5, 6, 7, 1, 8, 9, 10, 11, 12, 13, 14), Permutation.create(7, 6, 5, 4, 3, 2, 1, 8, 9, 10, 11, 12, 13, 14)),  // D_7
    },
    {Collections.singletonList(Permutation.create(2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 1))},  // Z_15
    {
      Collections.singletonList(Permutation.create(2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 1)), // Z_16
      Arrays.asList(Permutation.create(2, 3, 4, 5, 6, 7, 8, 1, 9, 10, 11, 12, 13, 14, 15, 16), Permutation.create(8, 7, 6, 5, 4, 3, 2, 1, 9, 10, 11, 12, 13, 14, 15, 16)),  // D_8
      Arrays.asList(Permutation.create(2, 3, 4, 5, 6, 7, 8, 1, 9, 10, 11, 12, 13, 14, 15, 16), Permutation.create(1, 2, 3, 4, 5, 6, 7, 8, 10, 9, 11, 12, 13, 14, 15, 16)),  // Z_8 x Z_2
      Arrays.asList(Permutation.create(2, 3, 4, 5, 6, 7, 8, 1, 10, 11, 12, 13, 14, 15, 16, 9), Permutation.create(9, 16, 15, 14, 13, 12, 11, 10, 5, 4, 3, 2, 1, 8, 7, 6)),  // Dic_4
      Arrays.asList(Permutation.create(2, 1, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16), Permutation.create(1, 2, 4, 3, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16), Permutation.create(1, 2, 3, 4, 6, 5, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16), Permutation.create(1, 2, 3, 4, 5, 6, 8, 7, 9, 10, 11, 12, 13, 14, 15, 16)),  // Z_2^4
      Arrays.asList(Permutation.create(2, 3, 4, 1, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16), Permutation.create(1, 2, 3, 4, 6, 7, 8, 5, 9, 10, 11, 12, 13, 14, 15, 16)),  // Z_4^2
      Arrays.asList(Permutation.create(2, 3, 4, 1, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16), Permutation.create(1, 2, 3, 4, 6, 5, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16), Permutation.create(1, 2, 3, 4, 5, 6, 8, 7, 9, 10, 11, 12, 13, 14, 15, 16)),  // Z_4xZ_2^2
      Arrays.asList(Permutation.create(2, 3, 4, 1, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16), Permutation.create(4, 3, 2, 1, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16), Permutation.create(1, 2, 3, 4, 6, 5, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16)),  // D_4xZ_2
      Arrays.asList(Permutation.create(2, 4, 6, 7, 3, 8, 1, 5, 9, 10, 11, 12, 13, 14, 15, 16), Permutation.create(3, 5, 4, 8, 7, 2, 6, 1, 9, 10, 11, 12, 13, 14, 15, 16), Permutation.create(1, 2, 3, 4, 5, 6, 7, 8, 10, 9, 11, 12, 13, 14, 15, 16)),  // Q_8xZ_2
      Arrays.asList(Permutation.create(2, 3, 4, 1, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16), Permutation.create(3, 2, 1, 4, 6, 7, 8, 5, 9, 10, 11, 12, 13, 14, 15, 16)),  // Z_4 semi Z_4
      Arrays.asList(Permutation.create(2, 3, 4, 5, 6, 7, 8, 1, 9, 10, 11, 12, 13, 14, 15, 16), Permutation.create(5, 2, 7, 4, 1, 6, 3, 8, 9, 10, 11, 12, 13, 14, 15, 16)),  // M4(2)
      Arrays.asList(Permutation.create(2, 3, 4, 5, 6, 7, 8, 1, 9, 10, 11, 12, 13, 14, 15, 16), Permutation.create(3, 6, 1, 4, 7, 2, 5, 8, 9, 10, 11, 12, 13, 14, 15, 16)),  // SD_16
      Arrays.asList(Permutation.create(2, 1, 4, 3, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16), Permutation.create(3, 4, 1, 2, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16), Permutation.create(3, 2, 1, 4, 6, 7, 8, 5, 9, 10, 11, 12, 13, 14, 15, 16)),  // V:Z_4
      Arrays.asList(Permutation.create(2, 3, 4, 1, 6, 7, 8, 5, 9, 10, 11, 12, 13, 14, 15, 16), Permutation.create(6, 5, 8, 7, 4, 3, 2, 1, 9, 10, 11, 12, 13, 14, 15, 16), Permutation.create(7, 8, 5, 6, 3, 4, 1, 2, 9, 10, 11, 12, 13, 14, 15, 16)),  // SU(2)
    },
    {Collections.singletonList(Permutation.create(2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 1))},  // Z_17
    {
      Collections.singletonList(Permutation.create(2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 1)), // Z_18
      Arrays.asList(Permutation.create(2, 3, 4, 5, 6, 7, 8, 9, 1, 10, 11, 12, 13, 14, 15, 16, 17, 18), Permutation.create(9, 8, 7, 6, 5, 4, 3, 2, 1, 10, 11, 12, 13, 14, 15, 16, 17, 18)),  // D_9
      Arrays.asList(Permutation.create(2, 3, 4, 5, 6, 1, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18), Permutation.create(1, 2, 3, 4, 5, 6, 8, 9, 7, 10, 11, 12, 13, 14, 15, 16, 17, 18)),  // C6 x C3
      Arrays.asList(Permutation.create(2, 1, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18), Permutation.create(3, 2, 1, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18), Permutation.create(1, 2, 3, 5, 6, 4, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18)), // S_3 x C3
      Arrays.asList(Permutation.create(2, 3, 1, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18), Permutation.create(1, 2, 3, 5, 6, 4, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18), Permutation.create(2, 1, 3, 5, 4, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18)), // S_3:C3
    },
    {Collections.singletonList(Permutation.create(2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 1))},  // Z_19
    {
      Collections.singletonList(Permutation.create(2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 1)), // Z_20
      Arrays.asList(Permutation.create(2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20), Permutation.create(10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20)),  // D_10
      Arrays.asList(Permutation.create(2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20), Permutation.create(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 11, 13, 14, 15, 16, 17, 18, 19, 20)),  // Z_10 x Z_2
      Arrays.asList(Permutation.create(2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 12, 13, 14, 15, 16, 17, 18, 19, 20, 11), Permutation.create(11, 20, 19, 18, 17, 16, 15, 14, 13, 12, 6, 5, 4, 3, 2, 1, 10, 9, 8, 7)),  // Dic_5
      Arrays.asList(Permutation.create(2, 3, 4, 1, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20), Permutation.create(5, 2, 4, 3, 1, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20)),  // Sz(2)
    },
    {
      Collections.singletonList(Permutation.create(2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 1)), // Z_21
      Arrays.asList(Permutation.create(2, 3, 4, 5, 6, 7, 1, 9, 10, 11, 12, 13, 14, 8, 16, 17, 18, 19, 20, 21, 15), Permutation.create(19, 21, 16, 18, 20, 15, 17, 4, 6, 1, 3, 5, 7, 2, 9, 11, 13, 8, 10, 12, 14)),  // C7:C3
    },
    {
      Collections.singletonList(Permutation.create(2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 1)), // Z_22
      Arrays.asList(Permutation.create(2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 1, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22), Permutation.create(11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22)),  // D_11
    },
    {Collections.singletonList(Permutation.create(2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 1))},  // Z_23
    {
      Collections.singletonList(Permutation.create(2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 1)), // Z_24
      Arrays.asList(Permutation.create(2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 1, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24), Permutation.create(12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24)),  // D_12
      Arrays.asList(Permutation.create(2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 1, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24), Permutation.create(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 14, 13, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24)),  // Z_12 x Z_2
      Arrays.asList(Permutation.create(2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 1, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 13), Permutation.create(13, 24, 23, 22, 21, 20, 19, 18, 17, 16, 15, 14, 7, 6, 5, 4, 3, 2, 1, 12, 11, 10, 9, 8)),  // Dic_6
      Arrays.asList(Permutation.create(2, 1, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24), Permutation.create(3, 2, 1, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24), Permutation.create(4, 2, 3, 1, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24)),  // S_4
      Arrays.asList(Permutation.create(2, 3, 4, 5, 6, 1, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24), Permutation.create(1, 2, 3, 4, 5, 6, 8, 7, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24), Permutation.create(1, 2, 3, 4, 5, 6, 7, 8, 10, 9, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24)),  // C_6 x V
      Arrays.asList(Permutation.create(2, 1, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24), Permutation.create(3, 2, 1, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24), Permutation.create(1, 2, 3, 5, 4, 7, 6, 8, 10, 9, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24), Permutation.create(1, 2, 3, 6, 7, 4, 5, 8, 10, 9, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24)), // S_3 x V
      Arrays.asList(Permutation.create(2, 3, 1, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24), Permutation.create(2, 1, 4, 3, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24), Permutation.create(1, 2, 3, 4, 6, 5, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24)),  // A_4 x C2
      Arrays.asList(Permutation.create(2, 3, 4, 5, 6, 1, 8, 9, 10, 11, 12, 7, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24), Permutation.create(8, 7, 12, 11, 10, 9, 5, 4, 3, 2, 1, 6, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24), Permutation.create(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 14, 13, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24)),  // Dic_3 x Z_2
      Arrays.asList(Permutation.create(2, 1, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24), Permutation.create(3, 2, 1, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24), Permutation.create(1, 2, 3, 5, 6, 7, 4, 8, 10, 9, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24)), // S_3 x C4
      Arrays.asList(Permutation.create(2, 3, 4, 1, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24), Permutation.create(3, 2, 1, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24), Permutation.create(1, 2, 3, 4, 6, 7, 5, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24)), // D_4 x C3
      Arrays.asList(Permutation.create(2, 4, 6, 7, 3, 8, 1, 5, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24), Permutation.create(3, 5, 4, 8, 7, 2, 6, 1, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24), Permutation.create(1, 2, 3, 4, 5, 6, 7, 8, 10, 11, 9, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24)), // Q_8 x C3
      GroupFactory.descriptionToPermutations("[2,3,4,5,6,7,8,1,10,11,12,13,14,15,16,9,18,19,20,21,22,23,24,17];[21,14,23,16,17,10,19,12,5,18,7,20,1,22,3,24,9,6,11,8,13,2,15,4]"), // C8:C3
      Arrays.asList(Permutation.create(2, 3, 4, 1, 6, 7, 8, 5, 10, 11, 12, 9, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24), Permutation.create(9, 5, 11, 7, 10, 3, 12, 1, 8, 2, 6, 4, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24), Permutation.create(1, 4, 3, 2, 12, 11, 10, 9, 8, 7, 6, 5, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24)), // D4:C3
      Arrays.asList(Permutation.create(2, 3, 4, 1, 6, 7, 8, 5, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24), Permutation.create(7, 6, 5, 8, 1, 4, 3, 2, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24), Permutation.create(1, 6, 3, 8, 4, 7, 2, 5, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24)), // SL2(GF3)
    },
    {
      Collections.singletonList(Permutation.create(2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 1)), // Z_25
      Arrays.asList(Permutation.create(2, 3, 4, 5, 1, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25), Permutation.create(1, 2, 3, 4, 5, 7, 8, 9, 10, 6, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25)),  // C_5xC_5
    },
    {
      Collections.singletonList(Permutation.create(2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 1)), // Z_26
      Arrays.asList(Permutation.create(2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 1, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26), Permutation.create(13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26)),  // D_13
    },
    {
      Collections.singletonList(Permutation.create(2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 1)), // Z_27
      Arrays.asList(Permutation.create(2, 3, 4, 5, 6, 7, 8, 9, 1, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27), Permutation.create(1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 10, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27)),  // C_9xC_3
      Arrays.asList(Permutation.create(2, 3, 1, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27), Permutation.create(1, 2, 3, 5, 6, 4, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27), Permutation.create(1, 2, 3, 4, 5, 6, 8, 9, 7, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27)),  // C_3^3
      Arrays.asList(Permutation.create(2, 3, 1, 5, 6, 4, 8, 9, 7, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27), Permutation.create(9, 7, 8, 3, 1, 2, 6, 4, 5, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27), Permutation.create(3, 9, 6, 7, 4, 1, 5, 2, 8, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27)),  // He3
      Arrays.asList(Permutation.create(2, 3, 4, 5, 6, 7, 8, 9, 1, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27), Permutation.create(1, 8, 6, 4, 2, 9, 7, 5, 3, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27)),  // C9:C3
    },
    {
      Collections.singletonList(Permutation.create(2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 1)), // Z_28
      Arrays.asList(Permutation.create(2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 1, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28), Permutation.create(14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28)),  // D_14
      Arrays.asList(Permutation.create(2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 1, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 15), Permutation.create(15, 28, 27, 26, 25, 24, 23, 22, 21, 20, 19, 18, 17, 16, 8, 7, 6, 5, 4, 3, 2, 1, 14, 13, 12, 11, 10, 9)),  // Dic_7
      Arrays.asList(Permutation.create(2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 1, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28), Permutation.create(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 16, 15, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28)),  // Z_14 x Z_2
    },
    {
      Collections.singletonList(Permutation.create(2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 1)), // Z_29
    },
    {
      Collections.singletonList(Permutation.create(2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 1)), // Z_30
      Arrays.asList(Permutation.create(2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 1, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30), Permutation.create(15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30)),  // D_15
      Arrays.asList(Permutation.create(2, 3, 4, 5, 1, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30), Permutation.create(5, 4, 3, 2, 1, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30), Permutation.create(1, 2, 3, 4, 5, 7, 8, 6, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30)),  // D_5xC_3
      Arrays.asList(Permutation.create(2, 1, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30), Permutation.create(3, 2, 1, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30), Permutation.create(1, 2, 3, 5, 6, 7, 8, 4, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30)), // S_3xC_5
    },
    {
      Collections.singletonList(Permutation.create(2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 1)), // Z_31
    },
    {
      Collections.singletonList(Permutation.create(2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 1)), // Z_32
      Arrays.asList(Permutation.create(2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 1, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32), Permutation.create(16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32)),  // D_16
      Arrays.asList(Permutation.create(2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 1, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 17), Permutation.create(23, 22, 21, 20, 19, 18, 17, 32, 31, 30, 29, 28, 27, 26, 25, 24, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 16)),  // Dic_8
      Arrays.asList(Permutation.create(2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 1, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32), Permutation.create(1, 8, 15, 6, 13, 4, 11, 2, 9, 16, 7, 14, 5, 12, 3, 10, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32)),  // SD_32
      GroupFactory.descriptionToPermutations("(32)(1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16);(2 10)(4 12)(6 14)(8 16)"), // M5(2)
      GroupFactory.descriptionToPermutations("(32)(1 2 3 4)(5 6 7 8);(1 4)(2 3)(5 8)(6 7);(1 5 3 7)(2 6 4 8);(1 7)(2 8)(3 5)(4 6)"), // D4oD4
      GroupFactory.descriptionToPermutations("(32)(1 2 3 4)(5 6 7 8)(9 10 11 12)(13 14 15 16);(1 16)(2 15)(3 14)(4 13)(5 11)(6 10)(7 9)(8 12);(1 11 3 9)(2 12 4 10)(5 14 7 16)(6 15 8 13);(1 4 3 2)(5 8 7 6)(9 10 11 12)(13 14 15 16)"), // D4oQ8
      GroupFactory.descriptionToPermutations("(32)(1 2 3 4)(5 6 7 8);(1 8)(2 7)(3 6)(4 5);(1 3)(2 4)(5 6 7 8)"), // C4wrC2
      GroupFactory.descriptionToPermutations("(32)(1 2)(3 4)(5 6)(7 8);(1 5)(2 6)(3 8)(4 7);(1 6)(2 5)(3 8)(4 7);(1 2)(3 7)(4 8)(5 6);(1 4)(2 8)(3 5)(6 7)"), // VwrC2
      GroupFactory.descriptionToPermutations("(32)(1 2 3 4 5 6 7 8)(9 10 11 12 13 14 15 16);(1 7 5 3)(2 8 6 4)(9 11 13 15)(10 12 14 16);(1 9)(2 10)(3 11)(4 12)(5 13)(6 14)(7 15)(8 16)"), // C8oD4
      GroupFactory.descriptionToPermutations("(32)(1 10 5 14)(2 11 6 15)(3 12 7 16)(4 13 8 9);(1 2 3 4 5 6 7 8)(9 10 11 12 13 14 15 16);(2 8)(3 7)(4 6)(9 11)(12 16)(13 15)"), // C4oD8
      GroupFactory.descriptionToPermutations("(32)(1 2 3 4 5 6 7 8);(2 4)(3 7)(6 8);(1 5)(3 7)"), // C8:V
      GroupFactory.descriptionToPermutations("(32)(1 2 3 4)(5 6 7 8)(9 10 11 12)(13 14 15 16);(1 6 15 9)(2 5 16 12)(3 8 13 11)(4 7 14 10);(1 4)(2 3)(5 11)(6 10)(7 9)(8 12)(13 16)(14 15)"), // C4:D4
      GroupFactory.descriptionToPermutations("(32)(1 2 3 4)(5 6 7 8)(9 10 11 12)(13 14 15 16);(1 9)(2 12)(3 11)(4 10)(5 14)(6 13)(7 16)(8 15);(1 7 10 14)(2 6 11 13)(3 5 12 16)(4 8 9 15)"), // D4:C4
      GroupFactory.descriptionToPermutations("(32)(1 2 3 4)(5 6 7 8)(9 10 11 12)(13 14 15 16);(1 6 14 11)(2 7 15 12)(3 8 16 9)(4 5 13 10);(1 5)(2 8)(3 7)(4 6)(9 15)(10 14)(11 13)(12 16)"), // C4:1D4
      GroupFactory.descriptionToPermutations("(32)(2 7)(3 8);(2 7)(4 5);(1 6)(2 7)(3 8)(4 5);(1 2 3 4)(5 6 7 8)"), // C2^3:C4
      GroupFactory.descriptionToPermutations("(32)(2 12)(4 14)(6 16)(8 10);(1 11)(2 12)(3 13)(4 14)(5 15)(6 16)(7 9)(8 10);(1 2 3 4 5 6 7 8)(9 10 11 12 13 14 15 16)"), // V:C8
      GroupFactory.descriptionToPermutations("(32)(5 13)(6 14)(7 15)(8 16);(1 9)(2 10)(3 11)(4 12)(5 13)(6 14)(7 15)(8 16);(1 2 3 4)(5 6 7 8)(9 10 11 12)(13 14 15 16);(1 14 3 16)(2 13 4 15)(5 12 7 10)(6 11 8 9)"), // V:Q8
      GroupFactory.descriptionToPermutations("(32)(1 2 3 4)(5 6 7 8)(9 10 11 12)(13 14 15 16);(1 9 15 8)(2 10 16 5)(3 11 13 6)(4 12 14 7);(1 3)(2 14)(4 16)(5 12)(6 8)(7 10)(9 11)(13 15)"), // C4^2:C2
      GroupFactory.descriptionToPermutations("(32)(1 2 3 4)(5 6 7 8)(9 10 11 12)(13 14 15 16);(1 13 5 11)(2 14 6 12)(3 15 7 9)(4 16 8 10);(2 6)(4 8)(9 13)(10 12)(11 15)(14 16)"), // C4^2:2C2
      GroupFactory.descriptionToPermutations("(1 23 31 10)(2 11 32 24)(3 17 25 12)(4 13 26 18)(5 19 27 14)(6 15 28 20)(7 21 29 16)(8 9 30 22);(1 2 3 4 5 6 7 8)(9 10 11 12 13 14 15 16)(17 18 19 20 21 22 23 24)(25 26 27 28 29 30 31 32)"), // C4:C8
      GroupFactory.descriptionToPermutations("(1 2 3 4)(5 6 7 8)(9 10 11 12)(13 14 15 16)(17 18 19 20)(21 22 23 24)(25 26 27 28)(29 30 31 32);(1 7 22 10)(2 8 23 11)(3 5 24 12)(4 6 21 9)(13 18 25 29)(14 19 26 30)(15 20 27 31)(16 17 28 32);(1 14 22 26)(2 13 23 25)(3 16 24 28)(4 15 21 27)(5 32 12 17)(6 31 9 20)(7 30 10 19)(8 29 11 18)"), // C4:Q8
      GroupFactory.descriptionToPermutations("(1 2 3 4 5 6 7 8)(9 10 11 12 13 14 15 16)(17 18 19 20 21 22 23 24)(25 26 27 28 29 30 31 32);(1 16 32 19)(2 13 25 24)(3 10 26 21)(4 15 27 18)(5 12 28 23)(6 9 29 20)(7 14 30 17)(8 11 31 22)"), // C8:C4
      GroupFactory.descriptionToPermutations("(1 2 3 4)(5 6 7 8)(9 10 11 12)(13 14 15 16)(17 18 19 20)(21 22 23 24)(25 26 27 28)(29 30 31 32);(1 18 3 20)(2 17 4 19)(5 23 7 21)(6 22 8 24)(9 15 11 13)(10 14 12 16)(25 29 27 31)(26 32 28 30);(1 25 10 24)(2 28 11 23)(3 27 12 22)(4 26 9 21)(5 20 32 16)(6 19 29 15)(7 18 30 14)(8 17 31 13)"), // Q8:C4
      GroupFactory.descriptionToPermutations("(32)(1 3 5 7)(2 8 6 4);(1 2 3 4 5 6 7 8);(1 4 3 2 5 8 7 6)"), // C4.D4
      GroupFactory.descriptionToPermutations("(32)(1 2 3 4 5 6 7 8)(9 10 11 12 13 14 15 16);(1 9 3 15 5 13 7 11)(2 16 4 14 6 12 8 10)"), // C8.C4
      GroupFactory.descriptionToPermutations("(32)(1 2 3 4)(5 6 7 8)(9 10 11 12)(13 14 15 16);(1 10 15 5)(2 11 16 6)(3 12 13 7)(4 9 14 8);(1 6 3 8)(2 5 4 7)(9 15 11 13)(10 14 12 16)"), // C4.4D4
      GroupFactory.descriptionToPermutations("(32)(1 2 3 4 5 6 7 8)(9 10 11 12 13 14 15 16);(2 4)(3 7)(6 8)(10 12)(11 15)(14 16);(1 11)(2 16)(3 13)(4 10)(5 15)(6 12)(7 9)(8 14)"), // C8.V
      GroupFactory.descriptionToPermutations("(32)(1 3 5 7)(2 8 6 4)(9 11 13 15)(10 16 14 12);(1 2 3 4 5 6 7 8)(9 10 11 12 13 14 15 16);(1 16 7 10 5 12 3 14)(2 9 4 15 6 13 8 11)"), // C4.10D4
      GroupFactory.descriptionToPermutations("(32)(1 14)(2 7)(3 16)(4 5)(6 10)(8 12)(9 13)(11 15);(1 10)(2 11)(3 12)(4 9)(5 13)(6 14)(7 15)(8 16);(1 2 3 4)(5 6 7 8)(9 10 11 12)(13 14 15 16);(2 9)(4 11)(5 7)(6 14)(8 16)(13 15)"), // V.D4
      GroupFactory.descriptionToPermutations("(1 23)(2 24)(3 17)(4 18)(5 19)(6 20)(7 21)(8 22)(9 31)(10 32)(11 25)(12 26)(13 27)(14 28)(15 29)(16 30);(1 2 3 4 5 6 7 8)(9 10 11 12 13 14 15 16)(17 18 19 20 21 22 23 24)(25 26 27 28 29 30 31 32);(1 9 23 31)(2 16 24 30)(3 15 17 29)(4 14 18 28)(5 13 19 27)(6 12 20 26)(7 11 21 25)(8 10 22 32)"), // C2.D8
      GroupFactory.descriptionToPermutations("(1 21 5 17)(2 22 6 18)(3 23 7 19)(4 24 8 20)(9 28 13 32)(10 29 14 25)(11 30 15 26)(12 31 16 27);(1 2 3 4 5 6 7 8)(9 10 11 12 13 14 15 16)(17 18 19 20 21 22 23 24)(25 26 27 28 29 30 31 32);(1 11 19 28)(2 14 20 31)(3 9 21 26)(4 12 22 29)(5 15 23 32)(6 10 24 27)(7 13 17 30)(8 16 18 25)"), // C4.Q8
      GroupFactory.descriptionToPermutations("(1 23)(2 24)(3 21)(4 22)(5 9)(6 10)(7 11)(8 12)(13 25)(14 26)(15 27)(16 28)(17 30)(18 31)(19 32)(20 29);(1 2 3 4)(5 6 7 8)(9 10 11 12)(13 14 15 16)(17 18 19 20)(21 22 23 24)(25 26 27 28)(29 30 31 32);(1 31 27 11)(2 19 28 8)(3 29 25 9)(4 17 26 6)(5 21 20 13)(7 23 18 15)(10 22 30 14)(12 24 32 16)"), // C2.C4^2
      GroupFactory.descriptionToPermutations("(1 2 3 4)(5 6 7 8)(9 10 11 12)(13 14 15 16)(17 18 19 20)(21 22 23 24)(25 26 27 28)(29 30 31 32);(1 17 15 6)(2 18 16 7)(3 19 13 8)(4 20 14 5)(9 29 24 28)(10 30 21 25)(11 31 22 26)(12 32 23 27);(1 26 15 31)(2 32 16 27)(3 28 13 29)(4 30 14 25)(5 12 20 23)(6 24 17 9)(7 10 18 21)(8 22 19 11)"), // C4^2.C2
      GroupFactory.descriptionToPermutations("(32)(1 2);(3 4);(5 6);(7 8);(9 10)"), // C2^5
      GroupFactory.descriptionToPermutations("(32)(1 2 3 4);(5 6 7 8 9 10 11 12)"), // C4xC8
      GroupFactory.descriptionToPermutations("(32)(1 2);(3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18)"), // C2xC16
      GroupFactory.descriptionToPermutations("(32)(1 2);(3 4 5 6);(7 8 9 10)"), // C2xC4xC4
      GroupFactory.descriptionToPermutations("(32)(1 2);(3 4);(5 6 7 8 9 10 11 12)"), // C2xC2xC8
      GroupFactory.descriptionToPermutations("(32)(1 2);(3 4);(5 6);(7 8 9 10)"), // C2xC2xC2xC4
      GroupFactory.descriptionToPermutations("(32)(1 2 3 4)(5 6 7 8)(9 10 11 12)(13 14 15 16);(1 16 11 7)(2 13 12 8)(3 14 9 5)(4 15 10 6);(5 14)(6 15)(7 16)(8 13)"), // C4xD4
      GroupFactory.descriptionToPermutations("(32)(1 13)(2 14)(3 15)(4 16)(5 9)(6 10)(7 11)(8 12);(1 2 3 4 5 6 7 8)(9 10 11 12 13 14 15 16);(1 8)(2 7)(3 6)(4 5)(9 16)(10 15)(11 14)(12 13)"), // C2xD8
      GroupFactory.descriptionToPermutations("(32)(1 16)(2 9)(3 10)(4 11)(5 12)(6 13)(7 14)(8 15);(1 2 3 4 5 6 7 8)(9 10 11 12 13 14 15 16);(2 4)(3 7)(6 8)(9 11)(10 14)(13 15)"), // C2xSD16
      GroupFactory.descriptionToPermutations("(32)(1 6)(2 7)(3 8)(4 5)(9 13)(10 14)(11 15)(12 16);(1 13)(2 14)(3 15)(4 16)(5 12)(6 9)(7 10)(8 11);(1 2 3 4)(5 6 7 8)(9 10 11 12)(13 14 15 16);(1 16)(2 15)(3 14)(4 13)(5 9)(6 12)(7 11)(8 10)"), // C2^2xD4
      GroupFactory.descriptionToPermutations("(32)(1 10)(2 11)(3 12)(4 13)(5 14)(6 15)(7 16)(8 9);(1 2 3 4 5 6 7 8)(9 10 11 12 13 14 15 16);(1 14)(2 11)(3 16)(4 13)(5 10)(6 15)(7 12)(8 9)"), // C2xM4(2)
      GroupFactory.descriptionToPermutations("(1 2 3 4)(5 6 7 8)(9 10 11 12)(13 14 15 16)(17 18 19 20)(21 22 23 24)(25 26 27 28)(29 30 31 32);(1 17 9 14)(2 18 10 15)(3 19 11 16)(4 20 12 13)(5 27 30 24)(6 28 31 21)(7 25 32 22)(8 26 29 23);(1 28 9 21)(2 25 10 22)(3 26 11 23)(4 27 12 24)(5 13 30 20)(6 14 31 17)(7 15 32 18)(8 16 29 19)"), // C4xQ8
      GroupFactory.descriptionToPermutations("(1 26)(2 27)(3 28)(4 29)(5 30)(6 31)(7 32)(8 25)(9 23)(10 24)(11 17)(12 18)(13 19)(14 20)(15 21)(16 22);(1 2 3 4 5 6 7 8)(9 10 11 12 13 14 15 16)(17 18 19 20 21 22 23 24)(25 26 27 28 29 30 31 32);(1 23 5 19)(2 22 6 18)(3 21 7 17)(4 20 8 24)(9 30 13 26)(10 29 14 25)(11 28 15 32)(12 27 16 31)"), // C2xDic4
      GroupFactory.descriptionToPermutations("(1 9)(2 10)(3 11)(4 12)(5 21)(6 22)(7 23)(8 24)(13 19)(14 20)(15 17)(16 18)(25 30)(26 31)(27 32)(28 29);(1 22)(2 23)(3 24)(4 21)(5 12)(6 9)(7 10)(8 11)(13 28)(14 25)(15 26)(16 27)(17 31)(18 32)(19 29)(20 30);(1 2 3 4)(5 6 7 8)(9 10 11 12)(13 14 15 16)(17 18 19 20)(21 22 23 24)(25 26 27 28)(29 30 31 32);(1 17 3 19)(2 20 4 18)(5 27 7 25)(6 26 8 28)(9 15 11 13)(10 14 12 16)(21 32 23 30)(22 31 24 29)"), // C2^2xQ8
      GroupFactory.descriptionToPermutations("(32)(1 11)(2 12)(3 9)(4 10)(5 14)(6 15)(7 16)(8 13);(1 2 3 4)(5 6 7 8)(9 10 11 12)(13 14 15 16);(1 4 3 2)(5 6 7 8)(9 12 11 10)(13 14 15 16);(1 13)(2 14)(3 15)(4 16)(5 12)(6 9)(7 10)(8 11)"), // C2xC4oD4
      GroupFactory.descriptionToPermutations("(32)(1 9)(2 10)(3 11)(4 12)(5 16)(6 13)(7 14)(8 15);(2 14)(4 16)(5 12)(7 10);(1 13)(2 14)(3 15)(4 16)(5 12)(6 9)(7 10)(8 11);(1 2 3 4)(5 6 7 8)(9 10 11 12)(13 14 15 16)"), // C2xV:C4
      GroupFactory.descriptionToPermutations("(1 7)(2 8)(3 5)(4 6)(9 24)(10 21)(11 22)(12 23)(13 17)(14 18)(15 19)(16 20)(25 30)(26 31)(27 32)(28 29);(1 2 3 4)(5 6 7 8)(9 10 11 12)(13 14 15 16)(17 18 19 20)(21 22 23 24)(25 26 27 28)(29 30 31 32);(1 19 24 29)(2 18 21 32)(3 17 22 31)(4 20 23 30)(5 13 11 26)(6 16 12 25)(7 15 9 28)(8 14 10 27)"), // C2xC4:C4
    },
    {
      Collections.singletonList(Permutation.create(2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 1)), // C33
    },
    {
      Collections.singletonList(Permutation.create(2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 1)), // C34
      Arrays.asList(Permutation.create(2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 1, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34), Permutation.create(17, 16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34)),  // D17
    },
    {
      Collections.singletonList(Permutation.create(2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 1)), // C35
    },
    {
      Collections.singletonList(Permutation.create(2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 1)), // C36
      Arrays.asList(Permutation.create(2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 1, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36), Permutation.create(18, 17, 16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36)),  // D18
      GroupFactory.descriptionToPermutations("(1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18)(19 20 21 22 23 24 25 26 27 28 29 30 31 32 33 34 35 36);(1 20 10 29)(2 19 11 28)(3 36 12 27)(4 35 13 26)(5 34 14 25)(6 33 15 24)(7 32 16 23)(8 31 17 22)(9 30 18 21)"), // Dic9
      Arrays.asList(Permutation.create(2, 3, 4, 5, 6, 1, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36), Permutation.create(1, 2, 3, 4, 5, 6, 8, 9, 10, 11, 12, 7, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36)),  // C6^2
      GroupFactory.descriptionToPermutations("(36)(1 2);(3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20)"), // C2xC18
      GroupFactory.descriptionToPermutations("(36)(1 2 3);(4 5 6 7 8 9 10 11 12 13 14 15)"), // C3xC12
      GroupFactory.descriptionToPermutations("(36)(1 2 3 4 5 6)(7 8 9 10 11 12);(1 3 5)(2 4 6)(7 11 9)(8 12 10);(1 11)(2 12)(3 7)(4 8)(5 9)(6 10)"), // C6xS3
      GroupFactory.descriptionToPermutations("(36)(1 2 3)(4 5 6);(1 4)(2 6)(3 5);(1 3 2)(4 5 6);(1 4)(2 5)(3 6)"), // S3^2
      GroupFactory.descriptionToPermutations("(36)(1 3 5)(2 4 6)(7 11 9)(8 12 10);(1 2 3 4 5 6)(7 8 9 10 11 12);(1 10 4 7)(2 9 5 12)(3 8 6 11)"), // C3xDic3
      GroupFactory.descriptionToPermutations("(36)(1 2 3)(4 5 6)(7 8 9)(10 11 12);(1 4)(2 5)(3 6)(7 12)(8 10)(9 11);(1 10)(2 11)(3 12)(4 8)(5 9)(6 7);(1 2 3)(4 11 7)(5 12 8)(6 10 9)"), // C3xA4
      GroupFactory.descriptionToPermutations("(36)(1 6 4)(2 3 5);(1 4 6);(1 2)(3 4 5 6)"), // C3^2:C4
      GroupFactory.descriptionToPermutations("(1 20 29)(2 21 30)(3 22 25)(4 23 26)(5 24 27)(6 19 28)(7 31 14)(8 32 15)(9 33 16)(10 34 17)(11 35 18)(12 36 13);(1 2 3 4 5 6)(7 8 9 10 11 12)(13 14 15 16 17 18)(19 20 21 22 23 24)(25 26 27 28 29 30)(31 32 33 34 35 36);(1 7 4 10)(2 12 5 9)(3 11 6 8)(13 24 16 21)(14 23 17 20)(15 22 18 19)(25 35 28 32)(26 34 29 31)(27 33 30 36)"), // C3:Dic3
      GroupFactory.descriptionToPermutations("(36)(1 4 7)(2 5 8)(3 6 9)(10 13 16)(11 14 17)(12 15 18);(2 17)(3 18)(5 11)(6 12)(8 14)(9 15);(1 16)(3 18)(4 10)(6 12)(7 13)(9 15);(1 2 3 4 5 6 7 8 9)(10 11 12 13 14 15 16 17 18)"), // C3.A4
      GroupFactory.descriptionToPermutations("(36)(1 11)(2 12)(3 10)(4 13)(5 14)(6 15)(7 16)(8 17)(9 18);(1 2 3)(4 5 6)(7 8 9)(10 11 12)(13 14 15)(16 17 18);(1 5 8)(2 6 9)(3 4 7)(10 13 16)(11 14 17)(12 15 18);(1 11)(2 10)(3 12)(4 18)(5 17)(6 16)(7 15)(8 14)(9 13)"), // C2xC3:S3
    },
  };

  private static String getCycleIndexString(final CycleIndex cycleIndex, final int order) {
    cycleIndex.multiply(new Q(order));
    final String ci = cycleIndex.toString();
    final String s = ci.substring(ci.indexOf('=') + 1).replace('x', 'z').trim();
    if (order > 1) {
      return "[" + s + "]/" + order;
    } else {
      return s;
    }
  }

  private static final String LABEL_CHARS = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

  private static String label(final int v) {
    return LABEL_CHARS.substring(v, v + 1);
  }

  private static void dumpProperties(final PrintStream printStream, final String cycleIndexString, final List<Permutation<Integer>> gen, final Group<?> sg) {
    try (final PrintStream out = printStream) {
      final StringBuilder sb = new StringBuilder("Order: ");
      sb.append(sg.size());
      if (sg.isSimple()) {
        sb.append(", simple");
      }
      if (sg.isAbelian()) {
        sb.append(", Abelian");
      }
      sb.append(".\\\\\n").append(gen.size() > 1 ? "Generators:" : "Generator:");
      boolean comma = false;
      for (final Permutation<Integer> g : gen) {
        if (comma) {
          sb.append(';');
        } else {
          comma = true;
        }
        sb.append(' ');
        for (final List<Integer> c : g.cycleStructure()) {
          sb.append(c.toString().replace('[', '(').replace(']', ')').replace("),", ")"));
        }
      }
      sb.append(".\\\\\nCycle index: $").append(cycleIndexString).append("$.\\\\");
      out.println(sb.toString());
    }
  }

  private static void dumpCayleyTable(final File root, final String label, final Group<Object> sg, final Map<Object, String> labels) throws FileNotFoundException {
    try (final PrintStream out = new PrintStream(new FileOutputStream(new File(root, label + ".ct.tex")))) {
      out.println(CayleyTable.cayleyTable(sg, "", labels, 'r'));
    }
  }

  @SuppressWarnings("unchecked")
  private static void makePages(final File root) throws FileNotFoundException {
    for (int order = 1; order < GENERATORS_SMALL_GROUPS.length; ++order) {
      final SymmetricGroup<Integer> z = SymmetricGroup.create(order);
      final List<Permutation<Integer>>[] gens = GENERATORS_SMALL_GROUPS[order];
      for (int group = 0; group < gens.length; ++group) {
        final String label = "g" + order + "_" + group;
        final Group<?> sg = GroupFactory.createGroup(GroupFactory.smallGroupNames(order)[group]);
        final Group<Permutation<Integer>> g = gens[group] != null
          ? z.generateSubgroup(new FiniteSet<>(gens[group]))
          : (Group<Permutation<Integer>>) sg;
        try (final PrintStream out = new PrintStream(new FileOutputStream(new File(root, label + ".dot")))) {
          makeGraph(out, g, gens[group], label);
        }
        final Map<Object, String> labels = new HashMap<>(sg.size().intValueExact());
        int k = -1;
        for (final Object e : sg) {
          labels.put(e, label(++k));
        }
        dumpCayleyTable(root, label, (Group<Object>) sg, labels);
        dumpProperties(new PrintStream(new FileOutputStream(new File(root, label + ".prop.tex"))), getCycleIndexString(g.cycleIndex(), order), gens[group], sg);
      }
    }
  }

  /**
   * Graph of a Mathieu group.
   * @param args ignored
   * @throws FileNotFoundException for an I/O problem.
   */
  public static void main(final String... args) throws FileNotFoundException {
    if (args.length > 0) {
      if ("u33".equals(args[0])) {
        final Group<Permutation<Integer>> u33 = new Unitary33();
        final Permutation<Integer> a = Permutation.create(1, 3, 2, 6, 8, 4, 11, 5, 13, 15, 7, 14, 9, 12, 10, 20, 22, 23, 19, 16, 21, 17, 18, 27, 28, 26, 24, 25);
        final Permutation<Integer> b = Permutation.create(2, 4, 5, 7, 9, 10, 12, 11, 14, 13, 16, 17, 18, 19, 15, 21, 1, 24, 22, 25, 26, 3, 6, 23, 27, 28, 20, 8);
        makeGraph(u33, a, b);
      } else if ("--all".equals(args[0])) {
        makeAll();
      } else if ("--pages".equals(args[0])) {
        makePages(new File(args[1]));
      } else if (args[0].startsWith("Z")) {
        final int order = Integer.parseInt(args[0].substring(1));
        final SymmetricGroup<Integer> s = SymmetricGroup.create(order);
        // generators
        makeGraph(System.out, s, makeGeneratorsForSymmetricGroup(order), "S_" + order);
      }
    } else {
      final Group<Permutation<Integer>> m11 = new Mathieu11();
      final Permutation<Integer> a = Permutation.create(1, 10, 3, 11, 7, 6, 5, 9, 8, 2, 4);
      final Permutation<Integer> b = Permutation.create(4, 5, 8, 3, 6, 9, 7, 1, 2, 10, 11);
      makeGraph(m11, a, b);
    }
  }

}
