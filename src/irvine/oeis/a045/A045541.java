package irvine.oeis.a045;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence0;

/**
 * A045541 Square previous term and then delete digits of previous term.
 * @author Sean A. Irvine
 */
public class A045541 extends Sequence0 {

  private Z mA = null;

  private Z squareAndDelete(final Z n) {
    String s = n.square().toString();
    final int[] cnts = ZUtils.digitCounts(n);
    for (int k = 0; k < cnts.length; ++k) {
      if (cnts[k] > 0) {
        s = s.replace(String.valueOf(k), "");
      }
    }
    return new Z(s);
  }

  @Override
  public Z next() {
    mA = mA == null ? Z.TWO : squareAndDelete(mA);
    return mA;
  }
}
