package irvine.oeis.a084;

import irvine.math.group.PolynomialRing;
import irvine.math.polynomial.CyclotomicPolynomials;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A084732 Let p be the n-th prime; Cp(x) be the p-th cyclotomic polynomial (x^p-1)/(x-1); a(n) is the first prime Cp(x) after Cp(1).
 * @author Sean A. Irvine
 */
public class A084732 extends A000040 {

  private static final PolynomialRing<Z> RING = new PolynomialRing<>(Integers.SINGLETON);

  @Override
  public Z next() {
    final Polynomial<Z> cp = CyclotomicPolynomials.cyclotomic(super.next().longValueExact());
    long k = 1;
    while (true) {
      final Z t = RING.eval(cp, Z.valueOf(++k));
      if (t.isProbablePrime()) {
        return t;
      }
    }
  }
}
