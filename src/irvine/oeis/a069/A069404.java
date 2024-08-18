package irvine.oeis.a069;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A059680.
 * @author Sean A. Irvine
 */
public class A069404 extends Sequence1 {

  private boolean is(final int side, final int[] v, final int row, final int col, final HashSet<String> tried) {
    if (row == v.length - 1) {
      return true;
    }
    final String key = row + "," + (col + 1);
    if (!tried.add(key)) {
      return false;
    }
    assert (v[row] & (1 << col)) == (side << col);
    if ((v[row + 1] & (1 << col)) == (side << col) && is(side, v, row + 1, col, tried)) {
      return true;
    }
    if (col < 3 && (v[row] & (1 << (col + 1))) == (side << (col + 1))) {
      if (is(side, v, row, col + 1, tried)) {
        return true;
      }
    }
    if (col > 0 && (v[row] & (1 << (col - 1))) == (side << (col - 1))) {
      if (is(side, v, row, col - 1, tried)) {
        return true;
      }
    }
    tried.remove(key);
    return false;
  }

  private boolean is(final int side, final int[] v) {
    for (int k = 0; k < 4; ++k) {
      if ((v[0] & (1 << k)) == (side << k) && is(side, v, 0, k, new HashSet<>())) {
        return true;
      }
    }
    return false;
  }

  private String bin(final int v) {
    return String.valueOf((v >> 3) & 1) + ((v >> 2) & 1) + ((v >> 1) & 1) + (v & 1);
  }

  private void exhaust2() {
    final HashMap<Integer, Integer> cnts = new HashMap<>();
    long cnt = 0;
    final int[] v = new int[2];
    for (v[0] = 1; v[0] < 15; ++v[0]) {
      for (v[1] = 1; v[1] < 15; ++v[1]) {
        if (is(0, v) && is(1, v)) {
          ++cnt;
          final int u = Math.min(15 - v[1], v[1]);
          cnts.merge(u, 1, Integer::sum);
        }
      }
    }
    System.out.println("Exhaust direct count of 2x4 gives: " + cnt + " -> " + cnt / 2);
    for (final Map.Entry<Integer, Integer> e : cnts.entrySet()) {
      System.out.println(bin(e.getKey()) + " " + e.getValue() / 2);
    }
  }

  private void exhaust3() {
    final HashMap<Integer, Integer> cnts = new HashMap<>();
    long cnt = 0;
    final int[] v = new int[3];
    for (v[0] = 1; v[0] < 15; ++v[0]) {
      for (v[1] = 1; v[1] < 15; ++v[1]) {
        for (v[2] = 1; v[2] < 15; ++v[2]) {
          if (is(0, v) && is(1, v)) {
            ++cnt;
            final int u = Math.min(15 - v[2], v[2]);
            cnts.merge(u, 1, Integer::sum);
          }
        }
      }
    }
    System.out.println("Direct count of 3x4 gives: " + cnt + " -> " + cnt / 2);
    for (final Map.Entry<Integer, Integer> e : cnts.entrySet()) {
      System.out.println(bin(e.getKey()) + " " + e.getValue() / 2);
    }
  }

  // Note 0101 is a special case, cannot transition into it (effectively union of 01AB and AB01

  // @formatter:off
  // Following table indicates the valid transitions
  //   0000000ABBBB0000
  //   0001111BB000B11B
  //   011AA11001100A0A
  //   1A1ABA1111A11111
  //   0123456789012345
  private static final String TRANSITIONS =
      "#.#...####.#####" + // 0
      ".##..##..##....." + // 1
      "###..##..#######" + // 2
      "...####......#.#" + // 3
      "...###.........." + // 4
      ".######......##." + // 5
      "#######.....####" + // 6
      ".......##..#...." + // 7
      "#......##..##.#." + // 8
      "###......###...." + // 9
      ".##......##....." + // 10
      "#.#....###.##.#." + // 11
      "#...........#..." + // 12
      "......#......#.." + // 13
      "..............#." + // 14
      "..#............#";  // 15
  //   01234567890123
  // @formatter:on
  private static final String[] NODES = {"0001", "001A", "0011", "01AA", "01AB", "011A", "0111", "AB01", "BB01", "B011", "B01A", "B001", "0B01", "01A1", "0101", "0BA1"};
  // Start vector, 1 means this animal can be in the leftmost column
  private static final long[] START = {1, 1, 1, 1, 0, 1, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0};
  // Stop vector, 1 means this animal can be in the rightmost column
  //private static final long[] STOP = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1};

  static {
    assert TRANSITIONS.length() == START.length * START.length;
    assert NODES.length == START.length;
    System.out.println("digraph G {");
    System.out.println("  node [shape=none]");
    for (int j = 0; j < NODES.length; ++j) {
      System.out.println("  \"" + NODES[j] + "\" [label=\"" + NODES[j] + "\\n" + j + "\"];");
    }
    for (int j = 0; j < NODES.length; ++j) { // Next state
      for (int i = 0; i < NODES.length; ++i) { // Previous state
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
    exhaust2();
    exhaust3();
    ++mN;
    Z[] v = ZUtils.toZ(START);
    for (int k = 1; k < mN; ++k) {
      final Z[] next = new Z[v.length];
      Arrays.fill(next, Z.ZERO);
      for (int j = 0; j < v.length; ++j) { // Next animal
        for (int i = 0; i < v.length; ++i) { // Previous animal
          final int pos = j * v.length + i; // todo is this really right
          if (TRANSITIONS.charAt(pos) == '#') {
            next[j] = next[j].add(v[i]);
          }
        }
      }
      v = next;
      System.out.println(k + " " + Arrays.toString(v));
    }

    final HashMap<Integer, Integer> cnts = new HashMap<>();
    for (int k = 0; k < NODES.length; ++k) {
      //System.out.println(NODES[k] + " " + v[k]);
      final int u = Integer.parseInt(NODES[k].replace('A', '0').replace('B', '1'), 2);
      final int w = Math.min(15 - u, u);
      cnts.merge(w, v[k].intValueExact(), Integer::sum);
    }
    System.out.println("State counts");
    for (final Map.Entry<Integer, Integer> e : cnts.entrySet()) {
      System.out.println(bin(e.getKey()) + " " + e.getValue());
    }

    return Functions.SUM.z(v);
  }
}

