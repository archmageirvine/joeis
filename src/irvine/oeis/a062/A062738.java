package irvine.oeis.a062;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A062738 Number of connected labeled relations.
 * @author Sean A. Irvine
 */
public class A062738 extends Sequence0 {

  private static final MemoryFactorial F = MemoryFactorial.SINGLETON;
  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    final Q[] c = new Q[mN + 1];
    for (int k = 0; k < c.length; ++k) {
      c[k] = new Q(Z.ONE.shiftLeft(k * k), F.factorial(k));
    }
    return RING.log(Polynomial.create(c), mN).coeff(mN).multiply(F.factorial(mN)).toZ();
  }
}

