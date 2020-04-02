package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.oeis.a002.A002385;

/**
 * A030464 Primes that are the concatenation of two consecutive palindromic primes.
 * @author Sean A. Irvine
 */
public class A030464 extends A002385 {

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
