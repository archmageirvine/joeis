package irvine.oeis.a130;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A130074 Nonprimes k such that k divides 5^k - 3^k - 2^k = A130072(k).
 * @author Sean A. Irvine
 */
public class A130074 implements Sequence {

  private final Fast mPrime = new Fast();
  private int mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (!mPrime.isPrime(++mN)) {
        final Z n = Z.valueOf(mN);
        if (Z.FIVE.pow(mN).subtract(Z.THREE.pow(mN)).subtract(Z.ONE.shiftLeft(mN)).mod(n).isZero()) {
          return n;
        }
      }
    }
  }
}
