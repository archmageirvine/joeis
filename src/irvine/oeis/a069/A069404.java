package irvine.oeis.a069;

import java.util.Arrays;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A059680.
 * @author Sean A. Irvine
 */
public class A069404 extends Sequence1 {

  // @formatter:off
  // Following table indicates the valid transitions
  //   0000000ABBBB00
  //   0001111BB000B1
  //   011AA11001100A
  //   1A1ABA1111A111
  //   01234567890123
  private static final String TRANSITIONS =
      "#.#...####.###" + // 0
      ".##..##..##..." + // 1
      "###..##..#####" + // 2
      "...####......#" + // 3
      "...###........" + // 4
      ".######......#" + // 5
      "#######....###" + // 6
      ".......##..#.." + // 7
      "#......##..##." + // 8
      "###......###.." + // 9
      ".##......##..." + // 10
      "#.#...####.#.." + // 11
      "#.#.........#." + // 12
      "......#......#";  // 13
  //   01234567890123
  // @formatter:on
  private static final String[] NODES = {"0001", "001A", "0011", "01AA", "01AB", "011A", "0111", "AB01", "BB01", "B011", "B01A", "B001", "0B01", "01A1"};
  // Start vector, 1 means this animal can be in the leftmost column
  private static final long[] START = {1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0};
  // Stop vector, 1 means this animal can be in the rightmost column
  //private static final long[] STOP = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};

  static {
    assert TRANSITIONS.length() == START.length * START.length;
    assert NODES.length == START.length;
    System.out.println("digraph G {");
    System.out.println("  node [shape=none]");
    for (int j = 0; j < NODES.length; ++j) {
      System.out.println("  \"" + NODES[j] + "\" [label=\"" + NODES[j] + "\\n" + j + "\"];");
    }
    for (int j = 0; j < NODES.length; ++j) { // Next animal
      for (int i = 0; i < NODES.length; ++i) { // Previous animal
        if (i == j) {
          continue; // Don't bother showing the loops
        }
        final int pos1 = j * NODES.length + i;
        final int pos2 = i * NODES.length + j;
        if (TRANSITIONS.charAt(pos1) == '#') {
          final boolean bidirectional = TRANSITIONS.charAt(pos2) == '#';
          if (bidirectional) {
            if (j <= i) {
              System.out.println("  \"" + NODES[i] + "\" -> \"" + NODES[j] + "\" [dir=both color=red];");
            }
          } else {
            System.out.println("  \"" + NODES[i] + "\" -> \"" + NODES[j] + "\" [color=blue];");
          }
        }
      }
    }
    System.out.println("}");
    //System.exit(0);
  }

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z[] v = ZUtils.toZ(START);
    for (int k = 1; k < mN; ++k) {
      final Z[] next = new Z[v.length];
      Arrays.fill(next, Z.ZERO);
      for (int j = 0; j < v.length; ++j) { // Next animal
        for (int i = 0; i < v.length; ++i) { // Previous animal
          final int pos = i * v.length + j;
          if (TRANSITIONS.charAt(pos) == '#') {
//            if (j == 1) {
//              System.out.println("Allowing " + j + " to follow " + i + " with count " + v[i]);
//            }
            next[j] = next[j].add(v[i]);
          }
        }
      }
      v = next;
      System.out.println(k + " " + Arrays.toString(v));
    }
    return Functions.SUM.z(v);
  }
}

