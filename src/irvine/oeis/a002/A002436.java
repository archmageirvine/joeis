package irvine.oeis.a002;

import java.util.Arrays;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A002436 E.g.f.: Sum_{n &gt;= 0} a(n)*x^(2*n)/(2*n)! = sec(2*x).
 * @author Sean A. Irvine
 */
public class A002436 extends Sequence0 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private static final Polynomial<Q> TWOX = RING.create(Arrays.asList(Q.ZERO, Q.TWO));
  private Z mF = Z.ONE;
  private int mN = -2;

  @Override
  public Z next() {
    mN += 2;
    if (mN > 0) {
      mF = mF.multiply(mN).multiply(mN - 1);
    }
    return RING.sec(TWOX, mN).coeff(mN).multiply(mF).toZ();
  }
}
