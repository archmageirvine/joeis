package irvine.oeis.a013;

import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.Sequence;

/**
 * A013591 Orders of cyclotomic polynomials containing a coefficient the absolute value of which is &gt;= 3.
 * @author Sean A. Irvine
 */
public class A013591 implements Sequence {

  private int mN = 384;

  @Override
  public Z next() {
    while (true) {
      final Polynomial<Z> cyclo = Cyclotomic.cyclotomic(++mN);
      for (final Z c : cyclo) {
        if (c.abs().compareTo(Z.TWO) > 0) {
          return Z.valueOf(mN);
        }
      }
    }
  }
}
