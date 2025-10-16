package irvine.oeis.a076;

import irvine.math.function.Functions;
import irvine.oeis.ParallelPermutationSequence;

/**
 * A076143 Number of permutations p(1),...,p(n) of 1,...,n such that gcd(Sum_{k=1..m} p(k), p(m+1)) = 1 for all positive integers m &lt;= n-1.
 * @author Sean A. Irvine
 */
public class A076143 extends ParallelPermutationSequence {

  /** Construct the sequence. */
  public A076143() {
    super(1);
  }

  @Override
  protected long count(final int[] p) {
    return super.count(p);
  }

  @Override
  protected boolean accept(final int[] p, final int sum, final int pos) {
    if (pos <= 1) {
      return true;
    }
    // sum is 0-based and include putative (pos-1)-th element, so we need to add pos - 1
    return Functions.GCD.i(sum - p[pos - 1] + pos - 1, p[pos - 1] + 1) == 1;
  }
}
