package irvine.oeis.a071;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A071414 Number of times 4n+r and 2n+r are both prime, with 0 &lt; r &lt; 2n.
 * @author Sean A. Irvine
 */
public class A071414 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long cnt = 0;
    for (long r = 1; r < 2 * mN; ++r) {
      if (mPrime.isPrime(2 * mN + r) && mPrime.isPrime(4 * mN + r)) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}
