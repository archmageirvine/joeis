package irvine.oeis.a080;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A080020 Primes of the form 9k^2 + 3k + 367, where k can be negative.
 * @author Sean A. Irvine
 */
public class A080020 extends Sequence1 {

  private long mN = -1;

  @Override
  public Z next() {
    while (true) {
      mN += 2;
      final Z t = Z.valueOf(mN).square().add(1467);
      if (!t.testBit(0) && !t.testBit(1)) {
        final Z u = t.shiftRight(2);
        if (u.isProbablePrime()) {
          return u;
        }
      }
    }
  }
}
