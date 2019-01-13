package irvine.oeis.a005;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005940.
 * @author Sean A. Irvine
 */
public class A005940 implements Sequence {

  private long mN = 0;
  private final Fast mPrime = new Fast();

  @Override
  public Z next() {
    long m = mN++;
    Z prod = Z.ONE;
    Z p = Z.TWO;
    do {
      if ((m & 1) == 1) {
        prod = prod.multiply(p);
      } else {
        p = mPrime.nextPrime(p);
      }
    } while ((m >>>= 1) > 0);
    return prod;
  }
}
