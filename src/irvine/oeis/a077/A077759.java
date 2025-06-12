package irvine.oeis.a077;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000217;

/**
 * A077759 Smaller of the two successive triangular numbers which differ in the use of only one digit.
 * @author Sean A. Irvine
 */
public class A077759 extends Sequence1 {

  private final Sequence mT = new A000217();
  private Z mA = mT.next();

  private boolean is(final int[] a, final int[] b) {
    int c = 0;
    for (int k = 0; k < a.length; ++k) {
      c += Math.abs(a[k] - b[k]);
      if (c > 2) {
        return false;
      }
    }
    return c > 0;
  }

  @Override
  public Z next() {
    while (true) {
      final Z t = mA;
      mA = mT.next();
      if (is(ZUtils.digitCounts(t), ZUtils.digitCounts(mA))) {
        return t;
      }
    }
  }
}

