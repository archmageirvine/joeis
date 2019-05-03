package irvine.oeis.a006;

import java.util.Arrays;
import java.util.Collections;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.RationalUnityExtension;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006846 Hammersley's polynomial <code>p_n(1)</code>.
 * @author Sean A. Irvine
 */
public class A006846 implements Sequence {

  private static final RationalUnityExtension SQRT3 = new RationalUnityExtension("t", 2, Q.THREE);
  private static final PolynomialRingField<Polynomial<Q>> RING = new PolynomialRingField<>(SQRT3);
  private static final Polynomial<Q> C1 = SQRT3.create(Arrays.asList(Q.ZERO, Q.HALF));
  private static final Polynomial<Q> C2 = SQRT3.create(Collections.singletonList(Q.HALF));
  private static final Polynomial<Polynomial<Q>> D1 = RING.create(Arrays.asList(SQRT3.zero(), C1));
  private static final Polynomial<Polynomial<Q>> D2 = RING.create(Arrays.asList(SQRT3.zero(), C2));
  private int mN = -2;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    mN += 2;
    if (mN > 1) {
      mF = mF.multiply(mN).multiply(mN - 1);
    }
    final Polynomial<Polynomial<Q>> num = RING.cosh(D1, mN);
    final Polynomial<Polynomial<Q>> den = RING.cos(D2, mN);
    final Polynomial<Polynomial<Q>> egf = RING.series(num, den, mN);
    return egf.coeff(mN).coeff(0).multiply(mF).toZ();
  }
}
