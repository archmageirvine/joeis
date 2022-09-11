package irvine.oeis.a059;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A059004 Smallest prime whose reversal is an n-th power.
 * @author Sean A. Irvine
 */
public class A059004 implements Sequence {

  private final Fast mPrimes = new Fast();
  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z p = Z.ONE;
    while (true) {
      p = mPrimes.nextPrime(p);
      final Z rev = ZUtils.reverse(p);
      rev.root(mN);
      if (rev.auxiliary() == 1) {
        return p;
      }
    }
  }
}
