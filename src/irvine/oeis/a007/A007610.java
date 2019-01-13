package irvine.oeis.a007;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A007610.
 * @author Sean A. Irvine
 */
public class A007610 implements Sequence {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long p = 1;
    while (true) {
      p = mPrime.nextPrime(p);
      Z sum = Z.valueOf(p);
      long q = p;
      for (int k = 1; k < mN; ++k) {
        q = mPrime.nextPrime(q);
        sum = sum.add(q);
      }
      if (sum.isProbablePrime()) {
        return Z.valueOf(p);
      }
      if ((mN & 1) == 0) {
        return Z.ZERO;
      }
    }
  }
}
