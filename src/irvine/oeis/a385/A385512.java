package irvine.oeis.a385;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A385512 allocated for Jean-Marc Rebert.
 * @author Sean A. Irvine
 */
public class A385512 extends Sequence0 {

  private final Fast mPrime = new Fast();
  private long mN = -1;

  private boolean is(long p, long n) {
    while (p != 0) {
      if (p % 10 == n % 10) {
        n /= 10;
        if (n == 0) {
          return true;
        }
      }
      p /= 10;
    }
    return false;
  }

  @Override
  public Z next() {
    ++mN;
    long p = mN;
    while (true) {
      p = mPrime.nextPrime(p);
      if (is(p, mN)) {
        return Z.valueOf(p);
      }
    }
  }
}

