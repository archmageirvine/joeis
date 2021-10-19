package irvine.oeis.a052;

import java.util.Arrays;

import irvine.factor.factor.Cheetah;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.a002.A002808;

/**
 * A052054 Composite numbers all of whose prime factors (considered with multiplicity) share at least one digit.
 * @author Sean A. Irvine
 */
public class A052054 extends A002808 {

  private boolean isIntersecting(final int[][] counts) {
    final boolean[] ok = new boolean[counts[0].length];
    Arrays.fill(ok, true);
    for (int k = 1; k < counts.length; ++k) {
      for (int j = 0; j < k; ++j) {
        for (int i = 0; i < counts[k].length; ++i) {
          ok[i] &= counts[k][i] > 0 && counts[j][i] > 0;
        }
      }
    }
    for (final boolean v : ok) {
      if (v) {
        return true;
      }
    }
    return false;
  }

  @Override
  public Z next() {
    while (true) {
      final Z composite = super.next();
      final FactorSequence fs = Cheetah.factor(composite);
      final Z[] p = fs.toZArray();
      final int[][] cnts = new int[p.length][];
      for (int k = 0; k < cnts.length; ++k) {
        cnts[k] = ZUtils.digitCounts(p[k]);
      }
      if (isIntersecting(cnts)) {
        return composite;
      }
    }
  }
}

