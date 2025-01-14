package irvine.oeis.a074;

import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A074162 a(1) = 1; a(n) = smallest multiple of n (&gt;n) using all nonprime digits (1,4,6,8,9 and 0) if n is a prime else using all prime digits and 1 if n is composite; or 0 if no such number exists.
 * @author Sean A. Irvine
 */
public class A074162 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    if (mN % 10 == 0 || mN % 15625 == 0) {
      return Z.ZERO;
    }
    final int mask = mPrime.isPrime(mN) ? 0b0010101100 : 0b1101010001;
    long m = mN;
    while (true) {
      m += mN;
      if ((Functions.SYNDROME.i(m) & mask) == 0) {
        return Z.valueOf(m);
      }
    }
  }
}
