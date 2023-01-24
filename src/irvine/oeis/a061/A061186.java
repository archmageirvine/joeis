package irvine.oeis.a061;

import java.util.Arrays;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A061186 Staircase of coefficients of polynomials used for column g.f.s of triangle A060923.
 * @author Sean A. Irvine
 */
public class A061186 extends Sequence0 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private static final Polynomial<Q> C1 = RING.create(Arrays.asList(Q.ONE, Q.THREE, Q.ONE, Q.TWO.negate()));
  private static final Polynomial<Q> C2 = RING.create(Arrays.asList(Q.ONE, Q.THREE.negate(), Q.ONE, Q.TWO));
  private int mN = -1;
  private int mM = 0;
  private Polynomial<Q> mRow = null;

  @Override
  public Z next() {
    if (++mM > mN + mN / 2) {
      ++mN;
      mM = 0;
      final int lim = 2 * (mN + mN / 2);
      final Polynomial<Q> a = RING.pow(C1, mN, lim);
      final Polynomial<Q> b = RING.pow(C2, mN, lim);
      mRow = RING.multiply(RING.add(a, b), Q.HALF);
    }
    return mRow.coeff(2 * mM).toZ();
  }
}
