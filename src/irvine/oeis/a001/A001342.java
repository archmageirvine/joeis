package irvine.oeis.a001;

import irvine.math.group.PolynomialRingField;
import irvine.math.q.Rationals;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

import java.util.Arrays;

/**
 * A001342.
 * @author Sean A. Irvine
 */
public class A001342 implements Sequence {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private static final Polynomial<Q> DEN = RING.create(Arrays.asList(Q.ONE, new Q(-5), new Q(10), new Q(-10), new Q(5), Q.NEG_ONE));
  private int mN = -1;
  private Z mF = Z.valueOf(24);

  @Override
  public Z next() {
    if (++mN > 1) {
      mF = mF.multiply(mN);
    }
    final Polynomial<Q> egf = RING.series(RING.exp(RING.x(), mN), DEN, mN);
    return egf.coeff(mN).multiply(mF).toZ();
  }
}
