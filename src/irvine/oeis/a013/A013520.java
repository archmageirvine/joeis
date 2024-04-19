package irvine.oeis.a013;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.function.Functions;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A013520 A problem in derangements.
 * @author Sean A. Irvine
 */
public class A013520 extends Sequence0 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private final MemoryFactorial mF = MemoryFactorial.SINGLETON;
  private Polynomial<Q> mB = RING.monomial(Q.ONE, 2);
  private int mN = 0;

  private Z a(final int n) {
    Z sum = Z.ZERO;
    Z nn = Z.ONE;
    for (int k = 0; k < n; ++k, nn = nn.multiply(n)) {
      sum = sum.add(Functions.FACTORIAL.z(n - 1).divide(Functions.FACTORIAL.z(k)).multiply(nn));
    }
    return sum.subtract(Z.valueOf(n - 1).pow(n - 1).multiply2());
  }

  @Override
  public Z next() {
    if (++mN >= 3) {
      mB = RING.add(mB, RING.monomial(new Q(a(mN), Functions.FACTORIAL.z(mN)), mN));
    }
    return RING.exp(mB, mN).coeff(mN).multiply(Functions.FACTORIAL.z(mN)).toZ();
  }
}
