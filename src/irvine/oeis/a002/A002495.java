package irvine.oeis.a002;

import java.util.Collections;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.polynomial.ThetaFunctions;
import irvine.math.z.Z;

/**
 * A002495 Theta series of 27-dimensional unimodular lattice with root system <code>A_1</code> with no parity vector of norm 3.
 * @author Sean A. Irvine
 */
public class A002495 extends A002408 {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private static final Z Z54 = Z.valueOf(54);
  private static final Z Z218 = Z.valueOf(218);
  private final Polynomial<Z> mDelta = RING.create(Collections.emptyList());
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    mDelta.add(super.next());
    final Polynomial<Z> theta3 = ThetaFunctions.theta3z(mN);
    final Polynomial<Z> a = RING.pow(theta3, 27, mN);
    final Polynomial<Z> b = RING.multiply(RING.multiply(mDelta, RING.pow(theta3, 19, mN), mN), Z54);
    final Polynomial<Z> c = RING.multiply(RING.multiply(RING.pow(mDelta, 2, mN), RING.pow(theta3, 11, mN), mN), Z218);
    return a.coeff(mN).subtract(b.coeff(mN)).add(c.coeff(mN));
  }
}
