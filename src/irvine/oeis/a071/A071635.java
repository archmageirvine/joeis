package irvine.oeis.a071;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence0;
import irvine.oeis.a002.A002144;

/**
 * A071635 Number of decompositions of 4*n+2 into sum of two primes of form 4*k+1.
 * @author Sean A. Irvine
 */
public class A071635 extends Sequence0 {

  private final Fast mPrime = new Fast();
  private long mN = -2;

  @Override
  public Z next() {
    mN += 4;
    final Sequence s = new A002144();
    long cnt = 0;
    long p;
    while ((p = s.next().longValueExact()) * 2 <= mN) {
      if (mPrime.isPrime(mN - p)) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}
