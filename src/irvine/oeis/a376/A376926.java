package irvine.oeis.a376;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A376926 a(n) is the number of ways n can be written as x + y with x &gt;= y, x and y coprime, and so that the distinct prime factors of x*y*n are consecutive primes starting with 2.
 * @author Sean A. Irvine
 */
public class A376926 extends Sequence1 {

  protected long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long cnt = 0;
    for (long k = 1; k <= mN / 2; ++k) {
      if (Functions.GCD.l(k, mN - k) == 1) {
        final FactorSequence fs = new FactorSequence();
        fs.add(k, FactorSequence.UNKNOWN);
        fs.add(mN, FactorSequence.UNKNOWN);
        fs.add(mN - k, FactorSequence.UNKNOWN);
        Jaguar.factor(fs);
        if (fs.toZArray()[fs.omega() - 1].longValue() == Functions.PRIME.l(fs.omega())) {
          ++cnt;
        }
      }
    }
    return Z.valueOf(cnt);
  }
}
