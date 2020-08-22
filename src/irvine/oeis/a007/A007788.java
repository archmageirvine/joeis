package irvine.oeis.a007;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.polynomial.PolynomialUtils;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007788 Number of augmented Andre 3-signed permutations: E.g.f. (1-sin(3*x))^(-1/3).
 * @author Sean A. Irvine
 */
public class A007788 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private static final Polynomial<Q> THREE_X = RING.multiply(RING.x(), Q.THREE);
  private Z mF = Z.ONE;
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN > 1) {
      mF = mF.multiply(mN);
    }
    final Polynomial<Q> nsin = RING.negate(RING.sin(THREE_X, mN));
    final Polynomial<Q> a = PolynomialUtils.cubeRoot(nsin, mN);
    return RING.coeff(RING.one(), a, mN).multiply(mF).toZ();
  }
}
