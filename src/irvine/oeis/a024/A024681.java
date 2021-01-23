package irvine.oeis.a024;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A024681 a(n) = number of ways p(n) is a sum of 3 odd nonprimes r,s,t satisfying 9 &lt;= r &lt; s &lt; t.
 * @author Sean A. Irvine
 */
public class A024681 implements Sequence {

  private final Fast mPrime = new Fast();
  private long mP = 1;

  @Override
  public Z next() {
    mP = mPrime.nextPrime(mP);
    long c = 0;
    for (long r = 9; 3 * r < mP; r += 2) {
      if (!mPrime.isPrime(r)) {
        final long u = mP - r;
        for (long s = r + 2; 2 * s < u; s += 2) {
          if (!mPrime.isPrime(s)) {
            final long t = u - s;
            if (!mPrime.isPrime(t)) {
              ++c;
            }
          }
        }
      }
    }
    return Z.valueOf(c);
  }
}
