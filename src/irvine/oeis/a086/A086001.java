package irvine.oeis.a086;

import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A086001 For p = prime(n), a(n) is the smallest k such that p*(1 + 2 Ord(4,p) k) is a base-2 pseudoprime.
 * @author Sean A. Irvine
 */
public class A086001 extends Sequence2 {

  private final Fast mPrime = new Fast();
  private Z mP = Z.TWO;

  @Override
  public Z next() {
    mP = mPrime.nextPrime(mP);
    final long m = Functions.ORDER.l(mP, 4);
    long k = 0;
    while (true) {
      final Z psp = mP.multiply(1 + 2 * m * ++k);
      if (Z.TWO.modPow(psp.subtract(1), psp).isOne()) {
        return Z.valueOf(k);
      }
    }
  }
}

