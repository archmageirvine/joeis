package irvine.oeis.a061;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A061584.
 * @author Sean A. Irvine
 */
public class A061584 extends Sequence1 {

  protected StringBuilder mA = null;

  @Override
  public Z next() {
    final StringBuilder s = mA;
    mA = new StringBuilder();
    if (s == null) {
      mA.append('1');
    } else {
      for (int k = 0; k < s.length(); ++k) {
        mA.append((s.charAt(k) - '0') * 6);
      }
    }
    return new Z(mA);
  }
}
