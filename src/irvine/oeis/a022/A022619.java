package irvine.oeis.a022;

import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A022619 Triangle T(n,k)of numbers of asymmetric Boolean functions of n variables with exactly k = 0..2^n nonzero values (atoms) under action of complementing group C(n,2).
 * @author Sean A. Irvine
 */
public class A022619 extends Sequence1 {

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private int mN = 0;
  private int mM = 1;
  private Polynomial<Z> mGf = null;

  @Override
  public Z next() {
    if (++mM >= (1 << mN) + 1) {
      ++mN;
      mM = 0;
      mGf = RING.zero();
      for (int j = 0; j <= mN; ++j) {
        mGf = RING.signedAdd((j & 1) == 0, mGf, RING.multiply(RING.pow(RING.onePlusXToTheN(1 << j), 1L << (mN - j)), Binomial.gaussianBinomial(mN, j, 2).shiftLeft((long) j * (j - 1) / 2)));
      }
    }
    return mGf.coeff(mM).divide(1L << mN);
  }
}
