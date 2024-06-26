package irvine.oeis.a060;

import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A060568 Number of primes between n and R(n) where R(n) (A004086) is the digit reversal of n.
 * @author Sean A. Irvine
 */
public class A060568 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    final long r = Functions.REVERSE.l(mN);
    long cnt = 0;
    if (mN < r) {
      for (long p = mPrime.nextPrime(mN); p < r; p = mPrime.nextPrime(p)) {
        ++cnt;
      }
    } else {
      for (long p = mPrime.nextPrime(r); p < mN; p = mPrime.nextPrime(p)) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}
