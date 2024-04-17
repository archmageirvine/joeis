package irvine.oeis.a007;

import java.util.ArrayList;

import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A007550 Natural numbers exponentiated twice.
 * @author Sean A. Irvine
 */
public class A007550 extends Sequence1 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private final ArrayList<Q> mCoeffs = new ArrayList<>();
  private int mN = 0;
  private Z mF = Z.ONE;
  {
    mCoeffs.add(Q.ZERO);
  }

  @Override
  public Z next() {
    mF = mF.multiply(++mN);
    mCoeffs.add(new Q(mN, mF));
    final Polynomial<Q> egf = RING.create(mCoeffs);
    final Polynomial<Q> et = RING.exp(RING.subtract(RING.exp(egf, mN), RING.one()), mN);
    return et.coeff(mN).multiply(mF).toZ();
  }
}
