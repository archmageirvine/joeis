package irvine.oeis.a076;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A076962 Smallest multiple of prime(n) with n divisors, or 0 if no such number exists.
 * @author Sean A. Irvine
 */
public class A076962 extends A000040 {

  // After Michel Marcus

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    final Z p = super.next();
    if (Z.TWO.equals(p)) {
      return Z.ZERO;
    }
    if (mPrime.isPrime(mN)) {
      return p.pow(mN - 1);
    }
    Z mp = p;
    while (Functions.SIGMA0.l(mp) != mN) {
      mp = mp.add(p);
    }
    return mp;
  }
}

