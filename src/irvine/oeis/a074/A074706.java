package irvine.oeis.a074;

import irvine.math.function.Functions;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A074696.
 * @author Sean A. Irvine
 */
public class A074706 extends Sequence0 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -1;
  private final Polynomial<Q> mDen = RING.empty();

  @Override
  public Z next() {
    mDen.add(new Q(Z.NEG_ONE.pow(++mN), mN == 0 ? 1 : (long) mN * mN));
    return RING.coeff(RING.one(), mDen, mN).multiply(Functions.FACTORIAL.z(mN).square()).toZ();
  }
}
