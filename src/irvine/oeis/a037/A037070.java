package irvine.oeis.a037;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence0;

/**
 * A037070 a(n)-th prime is the smallest prime containing exactly n 9's.
 * @author Sean A. Irvine
 */
public class A037070 extends Sequence0 {

  private final Fast mPrime = new Fast();
  private int mN = -1;

  @Override
  public Z next() {
    ++mN;
    long pi = 0;
    Z p = Z.ONE;
    while (true) {
      ++pi;
      p = mPrime.nextPrime(p);
      if (ZUtils.digitCounts(p)[9] == mN) {
        return Z.valueOf(pi);
      }
    }
  }
}
