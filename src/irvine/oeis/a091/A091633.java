package irvine.oeis.a091;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a014.A014261;

/**
 * A091633 Primes whose digits are restricted to 1,3,7,9 (same as terminal digits of primes).
 * @author Georg Fischer
 */
public class A091633 extends Sequence1 {

  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      mN += 2;
      if (A014261.isOddDigits(mN) && String.valueOf(mN).matches("[1379]+")) {
        final Z n = Z.valueOf(mN);
        if (n.isPrime()) {
          return n;
        }
      }
    }
  }
}
