package irvine.oeis.a013;

import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.Sequence1;

/**
 * A013593 Orders of cyclotomic polynomials containing a coefficient the absolute value of which is &gt;= 5.
 * @author Sean A. Irvine
 */
public class A013593 extends Sequence1 {

  private int mN = 1784;

  @Override
  public Z next() {
    while (true) {
      final Polynomial<Z> cyclo = Cyclotomic.cyclotomic(++mN);
      for (final Z c : cyclo) {
        if (c.abs().compareTo(Z.FOUR) > 0) {
          return Z.valueOf(mN);
        }
      }
    }
  }
}
