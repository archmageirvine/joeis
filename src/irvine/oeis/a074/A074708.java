package irvine.oeis.a074;

import irvine.math.function.Functions;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A074696.
 * @author Sean A. Irvine
 */
public class A074708 extends Sequence1 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = 0;
  private final Polynomial<Q> mF = RING.empty();
  {
    mF.add(Q.ONE);
  }

  @Override
  public Z next() {
    mF.add(new Q(-1, (long) ++mN * mN));
    return RING.log(mF, mN).coeff(mN).negate().multiply(Functions.FACTORIAL.z(mN).square()).toZ();
  }
}
