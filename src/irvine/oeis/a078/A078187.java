package irvine.oeis.a078;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000290;

/**
 * A078187 Smaller of the two successive squares which differ in the use of only one digit.
 * @author Sean A. Irvine
 */
public class A078187 extends Sequence1 {

  private final Sequence mS = new A000290().skip();
  private Z mA = mS.next();

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
      mA = mS.next();
      if (is(ZUtils.digitCounts(t), ZUtils.digitCounts(mA))) {
        return t;
      }
    }
  }
}

