package irvine.oeis.a007;

import irvine.math.factorial.MemoryFactorial;
import irvine.math.function.Functions;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A007757 Dwork-Kontsevich sequence evaluated at 2*n.
 * @author Sean A. Irvine
 */
public class A007757 extends Sequence1 {

  // After Michael Somos

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private final MemoryFactorial mF = MemoryFactorial.SINGLETON;
  private int mN = 0;

  @Override
  public Z next() {
    mN += 2;
    Polynomial<Q> a = RING.zero();
    Polynomial<Q> sum0 = a;
    Polynomial<Q> sum1 = a;
    for (int j = 0; j <= 2; ++j) {
      Q s = Q.ZERO;
      for (int k = j + 1; k <= j * mN; ++k) {
        s = s.add(new Q(1, k));
      }
      final Q q = new Q(Functions.FACTORIAL.z(mN * j), Functions.FACTORIAL.z(j).pow(mN));
      s = s.multiply(q);
      sum0 = RING.add(sum0, RING.monomial(s, j));
      sum1 = RING.add(sum1, RING.monomial(q, j));
    }
    a = RING.exp(RING.series(sum0, sum1, 2), 2);
    final Z c1 = a.coeff(1).toZ();
    final Z c2 = a.coeff(2).toZ();
    return c1.gcd(c1.add(c1.square()).divide2().subtract(c2));
  }
}
