package irvine.oeis.a061;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A061006 a(n) = (n-1)! mod n.
 * @author Sean A. Irvine
 */
public class A061006 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    if (mPrime.isPrime(++mN)) {
      return Z.valueOf(mN - 1);
    }
    return mN == 4 ? Z.TWO : Z.ZERO;
  }
}
