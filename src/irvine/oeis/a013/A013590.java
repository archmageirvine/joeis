package irvine.oeis.a013;

import irvine.math.cyclotomic.CyclotomicPolynomials;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A013590 Numbers k such that Phi(k,x) is a cyclotomic polynomial containing a coefficient with an absolute value greater than one.
 * @author Sean A. Irvine
 */
public class A013590 extends Sequence1 {

  private int mN = 104;

  @Override
  public Z next() {
    while (true) {
      final Polynomial<Z> cyclo = CyclotomicPolynomials.cyclotomic(++mN);
      for (final Z c : cyclo) {
        if (c.abs().compareTo(Z.ONE) > 0) {
          return Z.valueOf(mN);
        }
      }
    }
  }
}
