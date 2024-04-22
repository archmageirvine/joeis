package irvine.oeis.a046;

import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A046527 A triangle related to A000108 (Catalan) and A000302 (powers of 4).
 * @author Sean A. Irvine
 */
public class A046527 extends Sequence0 {

  protected int mN = -1;
  protected int mM = 0;

  protected Z t(final int n, final int m) {
    if (m == 0) {
      return Functions.CATALAN.z((long) n);
    }
    final Z b = Binomial.binomial(n, m - 1);
    return b.shiftLeft(2L * (n - m + 1))
      .subtract(b.multiply(Binomial.binomial(2L * n, n)).divide(Binomial.binomial(2L * m - 2, m - 1)))
      .divide2();
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return t(mN, mM);
  }
}

