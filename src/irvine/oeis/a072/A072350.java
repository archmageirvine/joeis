package irvine.oeis.a072;

import irvine.math.function.Functions;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.q.Q;
import irvine.math.q.Rationals;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A072350 E.g.f. A(x) satisfies A(A(x)) = tan(x), where A(x) = Sum_{n&gt;=1} a(n)*x^(2n-1)/(2n-1)!.
 * @author Sean A. Irvine
 */
public class A072350 extends Sequence1 {

  // After Paul D. Hanna

  private static final PolynomialRingField<Q> RING = new PolynomialRingField<Q>(Rationals.SINGLETON);
  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    final Polynomial<Q> f = RING.tan(RING.x(), 2 * mN);
    Polynomial<Q> a = f;
    for (int i = 0; i < 2 * mN; ++i) {
      final Polynomial<Q> b = RING.reversion(a, 2 * mN);
      a = RING.multiply(RING.add(a, RING.substitute(b, f, 2 * mN)), Q.HALF);
    }
    return a.coeff(2 * mN - 1).multiply(Functions.FACTORIAL.z(2 * mN - 1)).toZ();
  }
}
