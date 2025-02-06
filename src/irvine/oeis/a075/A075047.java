package irvine.oeis.a075;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.IntegerUtils;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A075047 Numbers k whose prime factorization contains the same digits as k.
 * @author Sean A. Irvine
 */
public class A075047 extends Sequence1 {

  private long mN = 24;

  private boolean subtract(final int[] cnts, final long n) {
    final int[] c = ZUtils.digitCounts(n);
    for (int k = 0; k < c.length; ++k) {
      cnts[k] -= c[k];
      if (cnts[k] < 0) {
        return false;
      }
    }
    return true;
  }

  private boolean is(final long n) {
    final int[] cnts = ZUtils.digitCounts(n);
    final FactorSequence fs = Jaguar.factor(n);
    for (final Z p : fs.toZArray()) {
      if (!subtract(cnts, p.longValue()) || !subtract(cnts, fs.getExponent(p))) {
        return false;
      }
    }
    return IntegerUtils.isZero(cnts);
  }

  @Override
  public Z next() {
    while (true) {
      if (is(++mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}

