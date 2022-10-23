package irvine.oeis.a067;

import irvine.factor.prime.Fast;
import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067793 Nonprimes n such that phi(n) &gt; 2n/3.
 * @author Georg Fischer
 */
public class A067793 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (!mPrime.isPrime(++mN)) {
        if (LongUtils.phi(mN) > 2 * mN / 3) {
          return Z.valueOf(mN);
        }
      }
    }
  }
}
