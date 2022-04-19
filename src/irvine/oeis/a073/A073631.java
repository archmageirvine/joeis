package irvine.oeis.a073;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A073631 Nonprimes k such that k divides 3^(k-1) - 2^(k-1).
 * @author Georg Fischer
 */
public class A073631 implements Sequence {

  private final Fast mPrime = new Fast();
  private int mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (!mPrime.isPrime(++mN)) {
        final Z n = Z.valueOf(mN);
        if (Z.THREE.pow(mN - 1).subtract(Z.ONE.shiftLeft(mN - 1)).mod(n).isZero()) {
          return Z.valueOf(mN);
        }
      }
    }
  }
}
