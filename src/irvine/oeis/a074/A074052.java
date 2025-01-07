package irvine.oeis.a074;

import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A074052 The lowest order term in an expansion of sum_{i=1..m}*i^n*(i+1)! in a special factorial basis.
 * @author Sean A. Irvine
 */
public class A074052 extends Sequence0 {

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private static final Polynomial<Z> C1 = Polynomial.create(2, 1);
  private static final Polynomial<Z> C2 = Polynomial.create(-1, 1);
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    Polynomial<Z> p = RING.zero();
    final Polynomial<Z> xn = RING.monomial(Z.ONE, mN);
    for (int k = mN - 1; k >= 0; --k) {
      final Z c = RING.add(RING.subtract(xn, RING.multiply(C1, p)), RING.substitute(p, C2, mN + 10)).coeff(k + 1);
      p = RING.add(p, RING.monomial(c, k));
    }
    return p.coeff(0).multiply(-2);
  }
}
