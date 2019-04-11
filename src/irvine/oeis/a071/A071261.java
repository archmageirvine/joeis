package irvine.oeis.a071;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A071261 Smallest k such that |p(k)-c(k)| is <code>an</code> n-digit number where p(k) is the k-th prime and c(k) is the k-th composite number.
 * @author Sean A. Irvine
 */
public class A071261 implements Sequence {

  private Z mP = Z.TWO;
  private Z mC = Z.FOUR;
  private int mN = 0;
  private long mK = 1;
  private final Fast mPrime = new Fast();

  @Override
  public Z next() {
    ++mN;
    while (true) {
      if (mP.subtract(mC).abs().toString().length() == mN) {
        return Z.valueOf(mK);
      }
      mP = mPrime.nextPrime(mP);
      do {
        mC = mC.add(1);
      } while (mPrime.isPrime(mC));
      ++mK;
    }
  }
}

