package irvine.oeis.a001;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A001527 a(n) = 2 * Sum_{i=0..n} C(2^n-1, i).
 * @author Sean A. Irvine
 */
public class A001527 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    if (++mN > 63) {
      throw new UnsupportedOperationException();
    }
    Z s = Z.ZERO;
    final long m = (1L << mN) - 1;
    for (int k = 0; k <= mN; ++k) {
      s = s.add(Binomial.binomial(m, k));
    }
    return s.multiply2();
  }
}
