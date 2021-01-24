package irvine.oeis.a038;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A038626 Smallest positive integer m such that m = pi(n*m) = A000720(n*m).
 * @author Sean A. Irvine
 */
public class A038626 implements Sequence {

  private final Fast mPrime = new Fast();
  private long mN = 1;
  private long mPi = 0;
  private long mM = 1;

  @Override
  public Z next() {
    ++mN;
    while (true) {
      if (mM == mN * mPi) {
        return Z.valueOf(mPi);
      }
      if (mPrime.isPrime(++mM)) {
        ++mPi;
      }
    }
  }
}
