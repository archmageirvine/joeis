package irvine.oeis.a059;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A059706 Smallest prime p such that p^n reversed is a prime.
 * @author Sean A. Irvine
 */
public class A059706 implements Sequence {

  private long mN = 0;
  private final Fast mPrime = new Fast();

  @Override
  public Z next() {
    ++mN;
    Z p = Z.ONE;
    while (true) {
      p = mPrime.nextPrime(p);
      if (ZUtils.reverse(p.pow(mN)).isProbablePrime()) {
        return p;
      }
    }
  }
}

