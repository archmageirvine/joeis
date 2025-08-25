package irvine.oeis.a387;

import irvine.factor.prime.Fast;
import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A387019 allocated for Gordon Hamilton.
 * @author Sean A. Irvine
 */
public class A387019 extends Sequence0 {

  private final Fast mPrime = new Fast();
  private long mN = -1;

  @Override
  public Z next() {
    long m = ++mN;
    Z prod = Z.ONE;
    long p = 1;
    while (m != 0) {
      p = mPrime.nextPrime(p);
      prod = prod.multiply(LongUtils.pow(p, m % 3));
      m /= 3;
    }
    return prod;
  }
}

