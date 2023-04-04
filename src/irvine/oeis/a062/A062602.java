package irvine.oeis.a062;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A062602 Number of ways of writing n = p+c with p prime and c nonprime (1 or a composite number).
 * @author Sean A. Irvine
 */
public class A062602 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long cnt = 0;
    for (long p = 2; p < mN; p = mPrime.nextPrime(p)) {
      if (!mPrime.isPrime(mN - p)) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}
