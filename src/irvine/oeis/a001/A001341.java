package irvine.oeis.a001;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Rationals;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

import java.util.Arrays;

/**
 * A001341 E.g.f.: 6*exp(x)/(1-x)^4;.
 * @author Sean A. Irvine
 */
public class A001341 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private static final Polynomial<Q> DEN = RING.create(Arrays.asList(Q.ONE, new Q(-4), new Q(6), new Q(-4), Q.ONE));
  private int mN = -1;
  private Z mF = Z.SIX;

  @Override
  public Z next() {
    if (++mN > 1) {
      mF = mF.multiply(mN);
    }
    final Polynomial<Q> egf = RING.series(RING.exp(RING.x(), mN), DEN, mN);
    return egf.coeff(mN).multiply(mF).toZ();
  }
}
