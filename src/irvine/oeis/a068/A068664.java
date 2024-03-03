package irvine.oeis.a068;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A054263.
 * @author Sean A. Irvine
 */
public class A068664 extends Sequence1 {

  private Z mA = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ONE;
    } else {
      Z t = mA;
      do {
        t = t.add(mA);
      } while (!ZUtils.isPalindrome(t, 10));
      mA = t;
    }
    return mA;
  }
}
