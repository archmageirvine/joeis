package irvine.oeis.a020;

import irvine.math.z.Fibonacci;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A020879 Number of elementary edge-subgraphs in Moebius ladder M_n.
 * @author Sean A. Irvine
 */
public class A020879 implements Sequence {

  // Direct enumeration

  private int mN = 1;
  private int[][] mGraph = null;
  private long mCount = 0;

  private static int[][] mobiusLadderGraph(final int n) {
    final int[][] neighbours = new int[2 * n][3];
    for (int k = 0; k < n; ++k) {
      neighbours[k][0] = k + 1;
      neighbours[k][1] = k - 1;
      neighbours[k][2] = n + k;
      neighbours[n + k][0] = n + k + 1;
      neighbours[n + k][1] = n + k - 1;
      neighbours[n + k][2] = k;
    }
    neighbours[0][1] = 2 * n - 1;
    neighbours[2 * n - 1][0] = 0;
    return neighbours;
  }

  private void cycle(final int start, final int second, final int current, final int prev, final boolean[] used) {
    for (final int n : mGraph[current]) {
      if (n > start && n != prev && !used[n]) {
          used[n] = true;
          cycle(start, second, n, current, used);
          used[n] = false;
      } else if (n == start && start != prev && current > second) {
        search(start + 1, used);
      }
    }
  }

  private void search(final int vertex, final boolean[] used) {
    if (vertex == used.length) {
      ++mCount;
      return;
    }
    if (used[vertex]) {
      // Already used this vertex step to next
      search(vertex + 1, used);
      return;
    }
    // Isolated vertex
    search(vertex + 1, used);
    // Single edge or cycle
    for (final int n : mGraph[vertex]) {
      if (n > vertex && !used[n]) {
        used[n] = true;
        search(vertex + 1, used);
        cycle(vertex, n, n, vertex, used);
        used[n] = false;
      }
    }
  }

  @Override
  public Z next() {
    mGraph = mobiusLadderGraph(++mN);
    mCount = 0;
    search(0, new boolean[mGraph.length]);
    return Z.valueOf(mCount);
  }


//  // Theorem 21.1 in J. P. McSorley, Counting structures in the Moebius ladder, Discrete Math., 184 (1998), 137-164.
//  // todo Note does not produce a(5) = 602
//  // todo Similarly a(5)=81 not produced by A20880
//
//  private int mN = 1;
//
  protected Z delta(final int n) {
    return Fibonacci.fibonacci(n);
  }

  protected Z zeroCase(final int n) {
    return Fibonacci.lucas(2 * n).add(1);
  }

//  static boolean isNonConsecutiveCyclic(final int k, final long n) {
//    final int bits = Long.bitCount(n);
//    if (bits <= 1) {
//      return true;
//    }
//    final long mask = (1L << bits) - 1;
//    final long carryBit = 1L << k;
//    long m = n;
//    for (int j = 0; j < k; ++j) {
//      if ((m & mask) == mask) {
//        return false;
//      }
//      m <<= 1;
//      if ((m & carryBit) != 0) {
//        m |= 1;
//        m &= carryBit - 1;
//      }
//    }
//    return true;
//  }
//
//  private Z ee(final int n, final int k) {
//    if (k == 0) {
//      return zeroCase(n);
//    }
//    Z sum = Z.ZERO;
//    final IntegerComposition ic = new IntegerComposition(n, k);
//    int[] x;
//    while ((x = ic.next()) != null) {
//      for (long setN = 0; setN < (1L << k) - 1; ++setN) {
//        if (isNonConsecutiveCyclic(k, setN)) {
//          long b = 1;
//          Z prod = Z.ONE;
//          for (int j = 0; j < k; ++j, b <<= 1) {
//            if ((setN & b) == 0) {
//              prod = prod.multiply(delta(x[j]));
//            }
//          }
//          sum = sum.add(prod.square());
//        }
//      }
//      if ((k & 1) == 1) {
//        Z prod = Z.ONE;
//        for (int j = 0; j < k; ++j) {
//          prod = prod.multiply(delta(x[j]));
//        }
//        sum = sum.add(prod.multiply2());
//      }
//    }
//    System.out.println("ee(" + n + "," + k + ")=" + sum.multiply(n).divide(k));
//    assert sum.multiply(n).mod(k) == 0;
//    return sum.multiply(n).divide(k);
//  }
//
//  @Override
//  public Z next() {
//    ++mN;
//    Z sum = Z.ZERO;
//    for (int k = 0; k <= mN; ++k) {
//      sum = sum.add(ee(mN, k));
//    }
//    return sum;
//  }
}
