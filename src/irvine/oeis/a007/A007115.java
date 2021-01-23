package irvine.oeis.a007;

import java.util.Arrays;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007115 Expansion of e.g.f. (1 - x - x^2)^x.
 * @author Sean A. Irvine
 */
public class A007115 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private static final Polynomial<Q> C = RING.create(Arrays.asList(Q.ZERO, Q.NEG_ONE, Q.NEG_ONE));
  private Z mF = Z.ONE;
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN > 1) {
      mF = mF.multiply(mN);
    }
    return RING.exp(RING.multiply(RING.x(), RING.log1p(C, mN)), mN).coeff(mN).multiply(mF).toZ();
  }
}
