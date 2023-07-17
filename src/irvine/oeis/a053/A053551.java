package irvine.oeis.a053;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;

/**
 * A053551 REVEGF transform of [1,2,12,152,3640,...] (A053549).
 * @author Sean A. Irvine
 */
public class A053551 extends A053549 {

  /** Construct the sequence. */
  public A053551() {
    setOffset(1);
  }

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private final Polynomial<Q> mA = RING.empty();
  private Z mF = Z.ONE;
  private int mN = -1;
  private boolean mSign = true;

  {
    mA.add(new Q(super.next()));
    next();
  }

  @Override
  public Z next() {
    if (++mN > 1) {
      mF = mF.multiply(mN);
    }
    mA.add(new Q(super.next(), mF));
    final Z t = RING.reversion(mA, mN).coeff(mN).multiply(mF).toZ();
    mSign = !mSign;
    return mSign ? t : t.negate();
  }
}
