package irvine.oeis.a083;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A083472 Smallest prime p such that the backward concatenation of n consecutive decreasing primes starting with p is a prime.
 * @author Sean A. Irvine
 */
public class A083472 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    final StringBuilder sb = new StringBuilder();
    long lo = 2;
    long loLim = 10;
    int delLen = 1;
    long hi = 1;
    for (int k = 0; k < mN; ++k) {
      hi = mPrime.nextPrime(hi);
      sb.insert(0, hi);
    }
    while (true) {
      final Z t = new Z(sb);
      if (t.isProbablePrime()) {
        return Z.valueOf(hi);
      }
      hi = mPrime.nextPrime(hi);
      sb.delete(sb.length() - delLen, sb.length()).insert(0, hi);
      lo = mPrime.nextPrime(lo);
      if (lo >= loLim) {
        loLim *= 10;
        ++delLen;
      }
    }
  }
}
