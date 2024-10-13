package irvine.oeis.a072;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A072586 Number of numbers &lt;= n having prime factors with odd exponents only.
 * @author Sean A. Irvine
 */
public class A072586 extends Sequence1 {

  private long mN = 0;
  private Z mCount = Z.ZERO;

  private boolean is(final long n) {
    if (n == 1) {
      return false;
    }
    final FactorSequence fs = Jaguar.factor(n);
    for (final Z p : fs.toZArray()) {
      if ((fs.getExponent(p) & 1) == 0) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    if (is(++mN)) {
      mCount = mCount.add(1);
    }
    return mCount;
  }
}
