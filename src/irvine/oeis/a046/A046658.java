package irvine.oeis.a046;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A046658 Triangle related to A001700 and A000302 (powers of 4).
 * @author Sean A. Irvine
 */
public class A046658 extends Sequence1 {

  private int mN = 0;
  private int mM = 0;

  private Z t(final int n, final int m) {
    final Z b = Binomial.binomial(n, m - 1);
    return b.multiply(Binomial.binomial(2L * n, n))
      .divide(Binomial.binomial(2L * (m - 1), m - 1))
      .subtract(b.multiply(m - 1).shiftLeft(2L * (n - m + 1)).divide(n))
      .divide2();
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return t(mN, mM);
  }
}
