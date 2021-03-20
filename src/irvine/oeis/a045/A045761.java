package irvine.oeis.a045;

import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A045761 Define polynomials Pn by P0 = 0, P1 = x, P2 = P1 + P0, P3 = P2 * P1, P4 = P3 + P2, etc. alternately adding or multiplying. For even n &gt; 2k, then first k coefficients of Pn remain unchanged and their values are the first k terms of the sequence.
 * @author Sean A. Irvine
 */
public class A045761 implements Sequence {

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private Polynomial<Z> mA = RING.x();
  private Polynomial<Z> mB = RING.x();
  private int mLimit = 50;
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN > mLimit) {
      // Recompute polynomials to higher degree
      mLimit *= 2;
      mA = RING.x();
      mB = RING.x();
      for (int k = 0; k < mN; ++k) {
        mA = RING.multiply(mA, mB, mLimit);
        mB = RING.add(mA, mB);
      }
    }
    mA = RING.multiply(mA, mB, mLimit);
    mB = RING.add(mA, mB);
    return mB.coeff(mN);
  }
}
