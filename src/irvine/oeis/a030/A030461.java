package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A030461 Primes that are concatenations of two consecutive primes.
 * @author Sean A. Irvine
 */
public class A030461 extends A000040 {

  private Z mP = super.next();

  @Override
  public Z next() {
    while (true) {
      final Z t = mP;
      mP = super.next();
      final Z candidate = new Z(t.toString() + mP);
      if (candidate.isProbablePrime()) {
        return candidate;
      }
    }
  }
}
