package irvine.oeis.a066;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a001.A001927;

/**
 * A066303 Number of connected reduced partially ordered sets (posets) with n labeled elements.
 * @author Sean A. Irvine
 */
public class A066303 extends Sequence1 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private final Sequence mA = new A001927();
  private final Polynomial<Q> mB = RING.empty();
  private int mN = -1;
  {
    next();
  }

  @Override
  public Z next() {
    mB.add(new Q(mA.next(), MemoryFactorial.SINGLETON.factorial(++mN)));
    final Polynomial<Q> s = RING.series(RING.x(), RING.onePlusXToTheN(1), mN);
    return RING.substitute(mB, s, mN).coeff(mN).multiply(MemoryFactorial.SINGLETON.factorial(mN)).toZ();
  }
}

