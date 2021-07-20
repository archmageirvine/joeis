package irvine.oeis.a002;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000122;

/**
 * A002519 Theta series of 28-dimensional unimodular lattice with no roots and a parity vector of norm 4.
 * @author Sean A. Irvine
 */
public class A002519 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private static final Z Z56 = Z.valueOf(56);
  private static final Z Z280 = Z.valueOf(280);
  private static final Z Z512 = Z.valueOf(512);
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
    final Polynomial<Z> q28 = RING.pow(mTheta3, 28, mN);
    final Polynomial<Z> q20 = RING.multiply(RING.multiply(RING.pow(mTheta3, 20, mN), mDelta8, mN), Z56);
    final Polynomial<Z> q12 = RING.multiply(RING.multiply(RING.pow(mTheta3, 12, mN), RING.pow(mDelta8, 2, mN), mN), Z280);
    final Polynomial<Z> q4 = RING.multiply(RING.multiply(RING.pow(mTheta3, 4, mN), RING.pow(mDelta8, 3, mN), mN), Z512);
    final Polynomial<Z> q = RING.subtract(RING.add(RING.subtract(q28,  q20), q12), q4);
    return q.coeff(mN);
  }
}
