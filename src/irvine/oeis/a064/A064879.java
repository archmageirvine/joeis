package irvine.oeis.a064;

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A064879 Triangle of numbers composed of certain generalized Catalan numbers.
 * @author Sean A. Irvine
 */
public class A064879 extends Sequence0 {

  private int mN = -1;
  private int mM = 0;

  private Z c(final int m, final int n) {
    if (n <= 1) {
      return Z.ONE;
    }
    return Integers.SINGLETON.sum(0, n - 2,
      k -> Binomial.binomial(2L * (n - 2) - k, n - 2 - k).multiply(k + 1).multiply(k + 2).multiply(Z.valueOf(m).pow(2L * (n - 1) - k - 1))).divide(n - 1);
  }

  protected Z t(final int n, final int m) {
    return n >= m ? c(m, n - m) : Z.ZERO;
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

