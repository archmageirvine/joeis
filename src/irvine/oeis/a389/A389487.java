package irvine.oeis.a389;

import irvine.util.Permutation;

/**
 * A389487 Triangle read by rows: T(n,k) = number of heapable permutations of length n with exactly k increasing runs.
 * @author Sean A. Irvine
 */
public class A389487 extends A389255 {

  @Override
  protected int contribution(final int[] p) {
    return Permutation.countIncreasingRuns(p);
  }
}
