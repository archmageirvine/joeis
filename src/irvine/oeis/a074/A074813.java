package irvine.oeis.a074;

import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A074813 Number of primes between n and R(n) (inclusive), where R(n) (A004086) is the digit reversal of n.
 * @author Sean A. Irvine
 */
public class A074813 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    final long r = Functions.REVERSE.l(++mN);
    final long min = Math.min(r, mN);
    final long max = Math.max(r, mN);
    long cnt = 0;
    for (long p = mPrime.nextPrime(min - 1); p <= max; p = mPrime.nextPrime(p)) {
      ++cnt;
    }
    return Z.valueOf(cnt);
  }
}
