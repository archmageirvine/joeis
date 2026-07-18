package irvine.oeis.a085;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Conjectural;
import irvine.oeis.Sequence1;

/**
 * A085956 Smallest prime p such that (2n)*p +1 and (p-1)/(2n) are prime, or 0 if no such prime exists.
 * @author Sean A. Irvine
 */
public class A085956 extends Sequence1 implements Conjectural {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    if (++mN % 3 == 2) {
      if (mN == 2) {
        return Z.valueOf(13);
      }
      if (mN == 5) {
        return Z.valueOf(31);
      }
      if (mN == 35) {
        return Z.valueOf(211);
      }
      return Z.ZERO; // this is conjectural
    }
    final long m = 2 * mN;
    final Z zm = Z.valueOf(m);
    long p = 1;
    while (true) {
      p = mPrime.nextPrime(p);
      if (p % m == 1 && mPrime.isPrime((p - 1) / m) && zm.multiply(p).add(1).isProbablePrime()) {
        return Z.valueOf(p);
      }
    }
  }
}
