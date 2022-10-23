package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A001232 Numbers k such that 9*k = (k written backwards), k &gt; 0.
 * @author Sean A. Irvine
 */
public class A001232 extends Sequence1 {

  private Z mN = Z.valueOf(1088);
  private Z mLimit = Z.valueOf(10000);

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      final Z m = mN.multiply(9);
      if (m.compareTo(mLimit) >= 0) {
        mN = mLimit;
        mLimit = mLimit.multiply(10);
      }
      if (mN.multiply(9).equals(ZUtils.reverse(mN))) {
        return mN;
      }
    }
  }
}
