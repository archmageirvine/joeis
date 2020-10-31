package irvine.oeis.a036;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.string.StringUtils;

/**
 * A036370 Triangle of coefficients of generating function of ternary rooted trees of height at most n.
 * @author Sean A. Irvine
 */
public class A036370 implements Sequence {

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  protected static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  protected Polynomial<Z> mT = RING.one();
  private int mM = -1;

  // T_{i+1}(z) = 1 + z * (T_i(z)^3/6 + T_i(z^2)*T_i(z)/2 + T_i(z^3)/3); T_0(z) = 1.

  protected void step() {
    if (mVerbose) {
      StringUtils.message("Stepping to next polynomial");
    }
    mT = RING.add(RING.divide(RING.add(RING.add(RING.pow(mT, 3),
      RING.multiply(RING.multiply(mT.substitutePower(2), mT), Z.THREE)),
      RING.multiply(mT.substitutePower(3), Z.TWO)),
      Z.SIX).shift(1),
      RING.one());
  }

  @Override
  public Z next() {
    if (++mM > mT.degree()) {
      step();
      mM = 0;
    }
    return mT.coeff(mM);
  }
}
