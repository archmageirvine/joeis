package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A030469 Primes which are concatenations of three consecutive primes.
 * @author Sean A. Irvine
 */
public class A030469 extends A000040 {

  private Z mP0 = super.next();
  private Z mP1 = super.next();

  @Override
  public Z next() {
    while (true) {
      final Z t = mP0;
      mP0 = mP1;
      mP1 = super.next();
      final Z candidate = new Z(t.toString() + mP0 + mP1);
      if (candidate.isProbablePrime()) {
        return candidate;
      }
    }
  }
}
