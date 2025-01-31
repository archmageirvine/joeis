package irvine.oeis.a074;

import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A074830 Number of base reversals which result in a prime for bases less than n.
 * @author Sean A. Irvine
 */
public class A074830 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long cnt = 0;
    for (long b = 2; b < mN; ++b) {
      if (mPrime.isPrime(Functions.REVERSE.l(b, mN))) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}
