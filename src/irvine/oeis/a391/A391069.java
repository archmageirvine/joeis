package irvine.oeis.a391;

import irvine.math.polynomial.CyclotomicPolynomials;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.a386.A386606;

/**
 * A391069 allocated for A.H.M. Smeets.
 * @author Sean A. Irvine
 */
public class A391069 extends A386606 {

  private boolean is(final int n) {
    final Polynomial<Z> cp = CyclotomicPolynomials.cyclotomic(n);
    for (final Z c : cp) {
      if (c.abs().compareTo(Z.ONE) > 0) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      final Z n = super.next();
      if (is(n.intValueExact())) {
        return n;
      }
    }
  }
}
