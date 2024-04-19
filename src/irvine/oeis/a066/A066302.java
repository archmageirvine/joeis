package irvine.oeis.a066;

import irvine.math.function.Functions;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a001.A001035;

/**
 * A066302 Reduced partially ordered sets (posets) with n labeled elements.
 * @author Sean A. Irvine
 */
public class A066302 extends Sequence0 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private final Sequence mA = new A001035();
  private final Polynomial<Q> mB = RING.empty();
  private int mN = -1;

  @Override
  public Z next() {
    final int n = ++mN;
    mB.add(new Q(mA.next(), Functions.FACTORIAL.z(n)));
    final Polynomial<Q> s = RING.series(RING.x(), RING.onePlusXToTheN(1), mN);
    return RING.substitute(mB, s, mN).coeff(mN).multiply(Functions.FACTORIAL.z(mN)).toZ();
  }
}

