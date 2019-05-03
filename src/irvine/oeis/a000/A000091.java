package irvine.oeis.a000;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000091 Multiplicative with <code>a(2^e) = 2</code> for k <code>&gt;= 1; a(3) = 2, a(3^e) = 0</code> for k <code>&gt;= 2; a(p^e) = 0</code> if p <code>&gt; 3</code> and p <code>== -1 (mod 3); a(p^e) = 2</code> if p <code>&gt; 3</code> and p <code>== 1 (mod 3)</code>.
 * @author Sean A. Irvine
 */
public class A000091 implements Sequence {

  private long mN = 0;
  private final Fast mPrime = new Fast();

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ONE;
    }
    if (mN % 9 == 0) {
      return Z.ZERO;
    }
    if ((mN & (mN - 1)) == 0) {
      return Z.TWO;
    }
    int r = 1;
    long n = mN;
    while ((n & 1) == 0) {
      n >>>= 1;
      r = 2;
    }
    if (n % 3 == 0) {
      n /= 3;
      r *= 2;
    }
    long p = 3;
    while (n != 1) {
      p = mPrime.nextPrime(p);
      if (n % p == 0) {
        if (p % 3 == 2) {
          return Z.ZERO;
        }
        do {
          n /= p;
        } while (n % p == 0);
        r *= 2;
      }
    }
    return Z.valueOf(r);
  }

}

