package irvine.oeis.a118;

import irvine.math.cr.CR;
import irvine.math.cr.Convergents;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A118612 Denominator if the numerator and denominator of the continued fraction rational approximation of sqrt(2) are both prime.
 * @author Sean A. Irvine
 */
public class A118612 extends Sequence1 {

  private final Convergents mConvergents = new Convergents(CR.SQRT2);

  @Override
  public Z next() {
    while (true) {
      final Q c = mConvergents.next();
      if (c.den().isProbablePrime() && c.num().isProbablePrime()) {
        return c.den();
      }
    }
  }
}

