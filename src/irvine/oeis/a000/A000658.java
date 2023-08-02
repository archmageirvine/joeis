package irvine.oeis.a000;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A000658 Strehl's sequence "C_n^(3)".
 * @author Sean A. Irvine
 */
public class A000658 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z s = Z.ZERO;
    for (int k = 0; k <= mN; ++k) {
      s = s.add(Binomial.binomial(mN, k).square()
                .multiply(Binomial.binomial(2L * k, k).square())
                .multiply(Binomial.binomial(2L * k, mN - k)));
    }
    return s;
  }
}
