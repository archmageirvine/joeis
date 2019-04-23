package irvine.oeis.a020;

import irvine.factor.prime.Fast;
import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A020495 Neither square nor square + prime.
 * @author Sean A. Irvine
 */
public class A020495 implements Sequence {

  private final Fast mPrime = new Fast();
  private long mN = 9;

  @Override
  public Z next() {
    outer:
    while (true) {
      ++mN;
      final long s = LongUtils.sqrt(mN);
      if (s * s != mN) {
        for (long p = 2; p <= mN; p = mPrime.nextPrime(p)) {
          final long t = mN - p;
          final long r = LongUtils.sqrt(t);
          if (r * r == t) {
            continue outer;
          }
        }
        return Z.valueOf(mN);
      }
    }
  }
}
