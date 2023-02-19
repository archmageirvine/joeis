package irvine.oeis.a061;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A061509 Write n in decimal, omit 0's, replace the k-th digit d[k] with the k-th prime, raised to d[k]-th power and multiply.
 * @author Sean A. Irvine
 */
public class A061509 extends Sequence0 {

  private final Fast mPrime = new Fast();
  private long mN = -1;

  @Override
  public Z next() {
    final String s = String.valueOf(++mN);
    Z prod = Z.ONE;
    Z p = Z.ONE;
    for (int k = 0; k < s.length(); ++k) {
      if (s.charAt(k) != '0') {
        p = mPrime.nextPrime(p);
        prod = prod.multiply(p.pow(s.charAt(k) - '0'));
      }
    }
    return prod;
  }
}

