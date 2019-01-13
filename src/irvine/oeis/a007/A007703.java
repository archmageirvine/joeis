package irvine.oeis.a007;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000367;

/**
 * A007703.
 * @author Sean A. Irvine
 */
public class A007703 implements Sequence {

  private final Fast mPrime = new Fast();
  private long mP = 2;

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      final A000367 bernoulli = new A000367();
      boolean ok = true;
      for (long k = 0; k <= mP - 4; k += 2) {
        if (bernoulli.next().mod(mP) == 0) {
          ok = false;
          break;
        }
      }
      if (ok) {
        return Z.valueOf(mP);
      }
    }
  }
}
