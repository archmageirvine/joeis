package irvine.oeis.a002;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002034 Kempner numbers: smallest positive integer m such that n divides <code>m!</code>.
 * @author Sean A. Irvine
 */
public class A002034 implements Sequence {

  private final Fast mPrime = new Fast();
  protected int mN = 0;

  @Override
  public Z next() {
    if (mPrime.isPrime(++mN)) {
      return Z.valueOf(mN);
    }
    long c = 1;
    long f = 1;
    while (true) {
      f %= mN;
      if (f == 0) {
        return Z.valueOf(c);
      }
      f *= ++c;
    }
  }
}

