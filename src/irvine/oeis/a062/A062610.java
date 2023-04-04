package irvine.oeis.a062;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A062610 Number of ways of writing n = c1 + c2 with c1 and c2 nonprimes [=1 or composite].
 * @author Sean A. Irvine
 */
public class A062610 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long cnt = 0;
    for (long c = 1; 2 * c <= mN; ++c) {
      if (!mPrime.isPrime(c) && !mPrime.isPrime(mN - c)) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}
