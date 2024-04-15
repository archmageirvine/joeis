package irvine.oeis.a069;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A266780.
 * @author Sean A. Irvine
 */
public class A069248 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ZERO;
    }
    final FactorSequence fs = Jaguar.factor(mN);
    final long p = fs.largestPrimeFactor().longValue();
    long cnt = 0;
    for (final Z d : fs.divisors()) {
      if (d.mod(p) == 0) {
        ++cnt;
      }
    }
    return Z.valueOf(cnt);
  }
}
