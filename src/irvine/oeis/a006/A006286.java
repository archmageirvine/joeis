package irvine.oeis.a006;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006286 Numbers not of form p <code>+ 2^x + 2^y</code>.
 * @author Sean A. Irvine
 */
public class A006286 implements Sequence {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    outer:
    while (true) {
      ++mN;
      long t = 1;
      while (true) {
        if (mN - t <= 0) {
          return Z.valueOf(mN);
        }
        long u = 1;
        do {
          if (mPrime.isPrime(mN - t - u)) {
            continue outer;
          }
          u <<= 1;
        } while (u <= t);
        t <<= 1;
      }
    }
  }
}
