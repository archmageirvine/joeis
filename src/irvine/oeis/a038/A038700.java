package irvine.oeis.a038;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A038700 Smallest prime == -1 (mod n).
 * @author Sean A. Irvine
 */
public class A038700 implements Sequence {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long p = 1;
    while (true) {
      p = mPrime.nextPrime(p);
      if (p % mN == mN - 1) {
        return Z.valueOf(p);
      }
    }
  }
}
