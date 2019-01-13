package irvine.oeis.a013;

import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.nt.cyclotomic.Cyclotomic;
import irvine.oeis.Sequence;

/**
 * A013592.
 * @author Sean A. Irvine
 */
public class A013592 implements Sequence {

  private int mN = 1364;

  @Override
  public Z next() {
    while (true) {
      final Polynomial<Z> cyclo = Cyclotomic.cyclotomic(++mN);
      for (final Z c : cyclo) {
        if (c.abs().compareTo(Z.THREE) > 0) {
          return Z.valueOf(mN);
        }
      }
    }
  }
}
