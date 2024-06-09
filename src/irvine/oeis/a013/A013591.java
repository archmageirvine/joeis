package irvine.oeis.a013;

import irvine.math.cyclotomic.CyclotomicPolynomials;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A013591 Orders of cyclotomic polynomials containing a coefficient the absolute value of which is &gt;= 3.
 * @author Sean A. Irvine
 */
public class A013591 extends Sequence1 {

  private int mN = 384;

  @Override
  public Z next() {
    while (true) {
      final Polynomial<Z> cyclo = CyclotomicPolynomials.cyclotomic(++mN);
      for (final Z c : cyclo) {
        if (c.abs().compareTo(Z.TWO) > 0) {
          return Z.valueOf(mN);
        }
      }
    }
  }
}
