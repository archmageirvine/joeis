package irvine.oeis.a066;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.a000.A000984;

/**
 * A066376.
 * @author Sean A. Irvine
 */
public class A066397 extends A000984 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private final Polynomial<Q> mGf = RING.empty();
  private int mN = 0;
  {
    mGf.add(Q.ZERO);
  }

  @Override
  public Z next() {
    ++mN;
    mGf.add(new Q(super.next(), MemoryFactorial.SINGLETON.factorial(mN)));
    return RING.reversion(mGf, mN).coeff(mN).multiply(MemoryFactorial.SINGLETON.factorial(mN)).toZ();
  }
}
