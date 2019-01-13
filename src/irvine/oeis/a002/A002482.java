package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000122;
import irvine.math.group.PolynomialRingField;
import irvine.math.group.IntegerField;
import irvine.math.polynomial.Polynomial;

/**
 * A002482.
 * @author Sean A. Irvine
 */
public class A002482 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private static final Z Z54 = Z.valueOf(54);
  private static final Z Z216 = Z.valueOf(216);
  private final Sequence mA000122 = new A000122();
  private final Sequence mA002408 = new A002408();
  private Polynomial<Z> mTheta3 = RING.zero();
  private Polynomial<Z> mDelta8 = RING.zero();
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    mTheta3 = RING.add(mTheta3, RING.monomial(mA000122.next(), mN));
    mDelta8 = RING.add(mDelta8, RING.monomial(mA002408.next(), mN));
    final Polynomial<Z> q27 = RING.pow(mTheta3, 27, mN);
    final Polynomial<Z> q19 = RING.multiply(RING.multiply(RING.pow(mTheta3, 19, mN), mDelta8, mN), Z54);
    final Polynomial<Z> q11 = RING.multiply(RING.multiply(RING.pow(mTheta3, 11, mN), RING.pow(mDelta8, 2, mN), mN), Z216);
    final Polynomial<Z> q = RING.add(RING.subtract(q27,  q19), q11);
    return q.coeff(mN);
  }
}
