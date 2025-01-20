package irvine.oeis.a074;

import java.util.Arrays;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A074351 Number of elements of S_n having order n.
 * @author Sean A. Irvine
 */
public class A074351 extends Sequence1 {

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<>(Rationals.SINGLETON);
  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Polynomial<Q> sum = RING.zero();
    for (final Z dd : Jaguar.factor(mN).divisors()) {
      final int d = dd.intValue();
      final int m = Functions.MOBIUS.i(mN / d);
      if (m != 0) {
        final Q[] c = new Q[d + 1];
        Arrays.fill(c, Q.ZERO);
        for (final Z ee : Jaguar.factor(d).divisors()) {
          final int e = ee.intValue();
          c[e] = new Q(1, e);
        }
        sum = RING.signedAdd(m == 1, sum, RING.exp(Polynomial.create(c), mN));
      }
    }
    return sum.coeff(mN).multiply(Functions.FACTORIAL.z(mN)).toZ();
  }
}
