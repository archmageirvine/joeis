package irvine.oeis.a019;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A019565.
 * @author Sean A. Irvine
 */
public class A019565 implements Sequence {

  private final Fast mPrime = new Fast();
  private long mN = -1;

  @Override
  public Z next() {
    long m = ++mN;
    Z prod = Z.ONE;
    long p = 1;
    while (m != 0) {
      p = mPrime.nextPrime(p);
      if ((m & 1) == 1) {
        prod = prod.multiply(p);
      }
      m >>>= 1;
    }
    return prod;
  }
}
