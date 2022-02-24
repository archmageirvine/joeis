package irvine.oeis.a054;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A054842 If n = a + 10 * b + 100 * c + 1000 * d + ... then a(n) = (2^a) * (3^b) * (5^c) * (7^d) * ...
 * @author Sean A. Irvine
 */
public class A054842 implements Sequence {

  private final Fast mPrime = new Fast();
  private long mN = -1;

  @Override
  public Z next() {
    Z prod = Z.ONE;
    Z p = Z.ONE;
    if (++mN > 0) {
      long t = mN;
      while (t != 0) {
        p = mPrime.nextPrime(p);
        prod = prod.multiply(p.pow(t % 10));
        t /= 10;
      }
    }
    return prod;
  }
}
