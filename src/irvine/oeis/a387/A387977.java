package irvine.oeis.a387;

import irvine.oeis.a389.A389496;
import irvine.util.Permutation;

/**
 * A387977 Triangle T(n,k) read by rows, where T(n,k) = number of heapable permutations of length n with exactly k inversions.
 * @author Sean A. Irvine
 */
public class A387977 extends A389496 {

  @Override
  protected long count(final int[] p) {
    synchronized (A387977.this) {
      ++mRow[Permutation.countInversions(p)];
    }
    return 0;
  }
}
