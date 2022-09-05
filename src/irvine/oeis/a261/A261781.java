package irvine.oeis.a261;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.triangle.BaseTriangle;

/**
 * A261781 Number T(n,k) of compositions of n where each part i is marked with a word of length i over a k-ary alphabet whose letters appear in alphabetical order and all k letters occur at least once in the composition; triangle T(n,k), n &gt;= 0, 0 &lt;= k &lt;= n, read by rows.
 * whose letters appear in alphabetical order and all k letters occur at least once in the composition;
 * triangle T(n,k), n &gt;= 0, 0 &lt;= k &lt;= n, read by rows.
 * @author Georg Fischer
 */
public class A261781 extends BaseTriangle {

  /** Construct the sequence. */
  public A261781() {
    super(0, 0, 0);
    hasRAM(true);
  }

  @Override
  public Z triangleElement(final int n, final int k) {
    Z sum = Z.ZERO;
    for (int i = 0; i <= k; ++i) {
      sum = sum.add(A261780.B.get(n, k - i).multiply(((i & 1) == 0) ? 1 : -1).multiply(Binomial.binomial(k, i)));
    }
    return sum;
  }
}
