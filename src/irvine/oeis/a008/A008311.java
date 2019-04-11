package irvine.oeis.a008;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A008311 Triangle of expansions of powers of x in terms of Chebyshev polynomials T_n <code>(x)</code>.
 * @author Sean A. Irvine
 */
public class A008311 implements Sequence {

  private int mN = -1;
  private int mM = 1;

  @Override
  public Z next() {
    if (mN < 1) {
      ++mN;
      return Z.ONE;
    }
    mM += 2;
    if (mM > mN) {
      ++mN;
      mM = mN & 1;
    }
    final Z t = Binomial.binomial(mN, (mN - mM) / 2);
    return mM == 0 ? t.divide2() : t;
  }
}
