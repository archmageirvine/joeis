package irvine.oeis.a066;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066082 Prime octets: numbers k such that 210*k - 105 +- 2^j are prime for all 1 &lt;= j &lt;= 4.
 * @author Sean A. Irvine
 */
public class A066082 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mN = 242589;

  private boolean is(final long m) {
    for (long k = 0, j = 2; k < 4; ++k, j <<= 1) {
      if (!mPrime.isPrime(m - j)) {
        return false;
      }
      if (!mPrime.isPrime(m + j)) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      if (is(210 * ++mN - 105)) {
        return Z.valueOf(mN);
      }
    }
  }
}
