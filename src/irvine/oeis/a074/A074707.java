package irvine.oeis.a074;

import irvine.math.function.Functions;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A074707 exp(Sum_{n&gt;0} x^n/n^2) = Sum_{n&gt;=0} a(n)*x^n/n!^2.
 * @author Sean A. Irvine
 */
public class A074707 extends Sequence0 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -1;
  private final Polynomial<Q> mF = RING.empty();

  @Override
  public Z next() {
    mF.add(++mN == 0 ? Q.ZERO : new Q(1, (long) mN * mN));
    return RING.exp(mF, mN).coeff(mN).multiply(Functions.FACTORIAL.z(mN).square()).toZ();
  }
}
