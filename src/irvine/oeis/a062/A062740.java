package irvine.oeis.a062;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.function.Functions;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A062740 Number of connected labeled graphs with loops.
 * @author Sean A. Irvine
 */
public class A062740 extends Sequence0 {

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
      c[k] = new Q(Z.ONE.shiftLeft((long) k * (k + 1) / 2), Functions.FACTORIAL.z(k));
    }
    return RING.log(Polynomial.create(c), mN).coeff(mN).multiply(Functions.FACTORIAL.z(mN)).toZ();
  }
}

