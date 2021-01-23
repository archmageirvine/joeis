package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000122;
import irvine.math.group.PolynomialRingField;
import irvine.math.group.IntegerField;
import irvine.math.polynomial.Polynomial;

/**
 * A002433 Theta series of unique 26-dimensional unimodular lattice T_26 with no roots (and minimal norm 3).
 * @author Sean A. Irvine
 */
public class A002433 implements Sequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private static final Z Z52 = Z.valueOf(52);
  private static final Z Z156 = Z.valueOf(156);
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
    final Polynomial<Z> q26 = RING.pow(mTheta3, 26, mN);
    final Polynomial<Z> q18 = RING.multiply(RING.multiply(RING.pow(mTheta3, 18, mN), mDelta8, mN), Z52);
    final Polynomial<Z> q10 = RING.multiply(RING.multiply(RING.pow(mTheta3, 10, mN), RING.pow(mDelta8, 2, mN), mN), Z156);
    final Polynomial<Z> q = RING.add(RING.subtract(q26,  q18), q10);
    return q.coeff(mN);
  }
}
