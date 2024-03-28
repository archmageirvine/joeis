package irvine.oeis.a005;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A005729 a(n) is the smallest positive integer a for which there is an identity of the form a*n*x = Sum_{i=1..m} ai*gi(x)^n where a1, ..., am are in Z and g1(x), ..., gm(x) are in Z[x].
 * @author Sean A. Irvine
 */
public class A005729 extends Sequence1 {

  // After Chai Wah Wu

  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z c = Z.ONE;
    for (long p = 2; p < mN; p = mPrime.nextPrime(p)) {
      if (mN % p != 0) {
        final Z zp = Z.valueOf(p);
        long m = 1;
        outer:
        while (true) {
          ++m;
          if (zp.pow(m).subtract(1).divide(p - 1).longValueExact() > mN) {
            break;
          }
          long r = 0;
          while (true) {
            ++r;
            final long q = zp.pow(m * r).subtract(1).divide(zp.pow(r).subtract(1)).longValueExact();
            if (q > mN) {
              break;
            }
            if (mN % q == 0) {
              c = c.multiply(p);
              break outer;
            }
          }
        }
      } else {
        c = c.multiply((p & 1) == 1 || mN % 6 != 0 ? p : p * p);
      }
    }
    return c;
  }
}
