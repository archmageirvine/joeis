package irvine.oeis.a086;

import irvine.math.cr.CR;
import irvine.math.cr.Convergents;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A086386 Numerators of the rational convergents to sqrt(3) if both numerators and denominators are primes.
 * @author Sean A. Irvine
 */
public class A086386 extends Sequence1 {

  private final Convergents mConvergents = new Convergents(CR.THREE.sqrt());

  @Override
  public Z next() {
    while (true) {
      final Q c = mConvergents.next();
      if (c.den().isProbablePrime() && c.num().isProbablePrime()) {
        return c.num();
      }
    }
  }
}

