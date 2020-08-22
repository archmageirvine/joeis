package irvine.oeis.a019;

import irvine.factor.prime.Fast;
import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A019508 X^m=X rings without normal forms: integers m &gt; 1 for which there exist a prime p and integers a,b &gt; 0 such that both p^a-1 and p^b-1 divide m-1 but p^lcm(a,b)-1 does not divide m-1.
 * @author Sean A. Irvine
 */
public class A019508 implements Sequence {

  private final Fast mPrime = new Fast();
  private long mN = 20;

  @Override
  public Z next() {
    while (true) {
      ++mN;
      for (long p = 2; p < mN; p = mPrime.nextPrime(p)) {
        for (long a = 1, ap = p; ap < mN; ap *= p, ++a) {
          if (mN % (ap - 1) == 0) {
            for (long b = a + 1, bp = ap * p; bp < mN; bp *= p, ++b) {
              if (mN % (bp - 1) == 0) {
                final long lcm = LongUtils.lcm(a, b);
                long cp = bp;
                for (long c = b; c < lcm; ++c) {
                  cp *= p;
                }
                if (mN % (cp - 1) != 0) {
                  return Z.valueOf(mN + 1);
                }
              }
            }
          }
        }
      }
    }
  }
}
