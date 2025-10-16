package irvine.oeis.a067;

import irvine.oeis.ParallelPermutationSequence;

/**
 * A067957 Number of divisor chains of length n: permutations s_1,s_2,...,s_n of 1,2,...,n such that for all j=1,2,...,n, s_j divides Sum_{i=1..j} s_i.
 * @author Sean A. Irvine
 */
public class A067957 extends ParallelPermutationSequence {

  @Override
  protected boolean accept(final int[] p, final int sum, final int pos) {
    if (pos <= 1) {
      return true;
    }
    return (sum - p[pos - 1] + pos - 1) % (p[pos - 1] + 1) == 0;
  }
}
