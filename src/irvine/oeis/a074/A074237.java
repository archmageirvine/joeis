package irvine.oeis.a074;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A074237 Composites which use more than all their digits in their prime factorization.
 * @author Sean A. Irvine
 */
public class A074237 extends Sequence1 {

  private long mN = 94;

  private void add(final int[] s, final int[] a) {
    for (int k = 0; k < s.length; ++k) {
      s[k] += a[k];
    }
  }

  private boolean is(final long n) {
    final int[] syn = ZUtils.digitCounts(n);
    final int[] s = new int[syn.length];
    final FactorSequence fs = Jaguar.factor(n);
    for (final Z p : fs.toZArray()) {
      add(s, ZUtils.digitCounts(p));
      final int e = fs.getExponent(p);
      if (e > 1) {
        add(s, ZUtils.digitCounts(e));
      }
    }
    for (int k = 0; k < s.length; ++k) {
      if (syn[k] > s[k]) {
        return false;
      }
    }
    for (int k = 0; k < s.length; ++k) {
      if (syn[k] < s[k]) {
        return true;
      }
    }
    return false;
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
