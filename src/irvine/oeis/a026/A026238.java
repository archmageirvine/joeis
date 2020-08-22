package irvine.oeis.a026;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A026238 a(n) = j if n is the j-th prime, else a(n) = k if n is the k-th composite.
 * @author Sean A. Irvine
 */
public class A026238 implements Sequence {

  private final Fast mPrime = new Fast();
  private long mP = 2;
  private long mPi = 0;
  private long mCi = 0;
  private long mN = 1;

  @Override
  public Z next() {
    if (++mN == mP) {
      mP = mPrime.nextPrime(mP);
      return Z.valueOf(++mPi);
    } else {
      return Z.valueOf(++mCi);
    }
  }
}
