package irvine.oeis.a030;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A030471 Primes which are concatenations of four consecutive numbers.
 * @author Sean A. Irvine
 */
public class A030471 extends Sequence1 {

  private long mN = 2;

  @Override
  public Z next() {
    while (true) {
      mN += 2;
      final Z candidate = new Z(mN + String.valueOf(mN + 1) + (mN + 2) + (mN + 3));
      if (mN % 5 != 2 && candidate.isProbablePrime()) {
        return candidate;
      }
    }
  }
}
