package irvine.oeis.a028;

import irvine.factor.prime.Fast;
import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A028842 Product of digits of n is a prime.
 * @author Sean A. Irvine
 */
public class A028842 implements Sequence {

  private final Fast mPrime = new Fast();
  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      if (mPrime.isPrime(LongUtils.digitProduct(++mN))) {
        return Z.valueOf(mN);
      }
    }
  }
}
