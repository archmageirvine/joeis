package irvine.oeis.a052;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a002.A002808;

/**
 * A052053 Digits of the prime factors of composite a(n) are not shared.
 * @author Sean A. Irvine
 */
public class A052053 extends A002808 {

  private boolean isIntersecting(final int[][] counts) {
    for (int k = 1; k < counts.length; ++k) {
      for (int j = 0; j < k; ++j) {
        for (int i = 0; i < counts[k].length; ++i) {
          if (counts[k][i] > 0 && counts[j][i] > 0) {
            return true;
          }
        }
      }
    }
    return false;
  }

  @Override
  public Z next() {
    while (true) {
      final Z composite = super.next();
      final FactorSequence fs = Cheetah.factor(composite);
      if (fs.maxExponent() == 1) {
        final Z[] p = fs.toZArray();
        final int[][] cnts = new int[p.length][];
        for (int k = 0; k < cnts.length; ++k) {
          cnts[k] = ZUtils.digitCounts(p[k]);
        }
        if (!isIntersecting(cnts)) {
          return composite;
        }
      }
    }
  }
}

