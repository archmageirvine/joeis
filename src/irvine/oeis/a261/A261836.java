package irvine.oeis.a261;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.triangle.BaseTriangle;

/**
 * A261836 Number T(n,k) of compositions of n into distinct parts where each part i is marked with a word of length i over a k-ary alphabet whose letters appear in alphabetical order and all k letters occur at least once in the composition; triangle T(n,k), n&gt;=0, 0&lt;=k&lt;=n, read by rows.
 * with a word of length i over a k-ary alphabet whose letters appear in alphabetical order and
 * all k letters occur at least once in the composition; triangle T(n,k), n&gt;=0, 0&lt;=k&lt;=n, read by rows.
 * @author Georg Fischer
 */
public class A261836 extends BaseTriangle {

  /** Construct the sequence. */
  public A261836() {
    super(0, 0, 0);
    hasRAM(true);
  }

  @Override
  public Z triangleElement(final int n, final int k) {
    Z sum = Z.ZERO;
    for (int i = 0; i <= k; ++i) {
      sum = sum.add(A261835.B.get(n, n, 0, k - i).multiply(((i & 1) == 0) ? 1 : -1).multiply(Binomial.binomial(k, i)));
    }
    return sum;
  }
}
