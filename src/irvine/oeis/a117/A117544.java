package irvine.oeis.a117;

import irvine.math.polynomial.CyclotomicPolynomials;
import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A117544 Least k such that Phi(n,k), the n-th cyclotomic polynomial evaluated at k, is prime.
 * @author Sean A. Irvine
 */
public class A117544 extends Sequence1 {

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);
  private int mN = 0;

  @Override
  public Z next() {
    final Polynomial<Z> cp = CyclotomicPolynomials.cyclotomic(++mN);
    long m = 0;
    while (true) {
      final Z a = Z.valueOf(++m);
      final Z v = RING.eval(cp, a);
      if (v.isProbablePrime()) {
        return a;
      }
    }
  }
}
