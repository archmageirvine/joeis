package irvine.oeis.a032;

import java.util.Arrays;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A032274 Number of labeled series-reduced dyslexic mobiles (polygon rooted trees) with n leaves (root has degree 0 or <code>&gt;=2)</code>.
 * @author Sean A. Irvine
 */
public class A032274 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private static final Polynomial<Q> C1 = RING.create(Arrays.asList(Q.ZERO, Q.THREE, Q.HALF.negate()));
  private static final Polynomial<Q> C2 = RING.negate(RING.x());
  private int mN = 0;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    if (++mN > 1) {
      mF = mF.multiply(mN);
    }
    return RING.reversion(RING.divide(RING.add(C1, RING.log1p(C2, mN)), Q.TWO), mN).coeff(mN).multiply(mF).toZ();
  }
}
