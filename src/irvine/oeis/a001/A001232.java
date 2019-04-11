package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A001232 Numbers n such that <code>9*n = (n</code> written backwards), <code>n &gt; 0</code>.
 * @author Sean A. Irvine
 */
public class A001232 implements Sequence {

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
