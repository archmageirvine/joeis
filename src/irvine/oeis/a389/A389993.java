package irvine.oeis.a389;

import irvine.util.Permutation;

/**
 * A389993 Triangle read by rows: T(n,k) = number of heapable permutations of length n with exactly k consecutive pairs.
 * @author Sean A. Irvine
 */
public class A389993 extends A389255 {

  @Override
  protected int contribution(final int[] p) {
    return Permutation.countPairs(p) + 1;
  }
}
