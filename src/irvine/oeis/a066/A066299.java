package irvine.oeis.a066;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A066286.
 * @author Sean A. Irvine
 */
public class A066299 extends Sequence1 {

  private long mN = 0;

  private boolean is(final int[] a, final int[] b) {
    for (int k = 0; k < a.length; ++k) {
      if (a[k] > b[k]) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      final int[] a = ZUtils.digitCounts(++mN);
      final int[] b = ZUtils.digitCounts(Binomial.binomial(2 * mN, mN));
      if (is(a, b)) {
        return Z.valueOf(mN);
      }
    }
  }
}

