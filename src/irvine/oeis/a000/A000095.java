package irvine.oeis.a000;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000095 Number of fixed points of <code>GAMMA_0 (n)</code> of type i.
 * @author Sean A. Irvine
 */
public class A000095 implements Sequence {

  private long mN = 0;
  private final Fast mPrime = new Fast();

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    if ((mN & 3) == 0) {
      return Z.ZERO;
    }
    int r = 1;
    long n = mN;
    if ((n & 1) == 0) {
      n >>>= 1;
      r = 2;
    }
    long p = 2;
    while (n != 1) {
      p = mPrime.nextPrime(p);
      if (n % p == 0) {
        if ((p & 3) == 3) {
          return Z.ZERO;
        }
        do {
          n /= p;
        } while (n % p == 0);
        r *= 2;
      }
    }
    return Z.valueOf(r);
  }
}

