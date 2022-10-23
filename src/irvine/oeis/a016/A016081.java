package irvine.oeis.a016;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A016081 Add 4, then reverse digits; start with 3.
 * @author Sean A. Irvine
 */
public class A016081 extends Sequence1 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.THREE : ZUtils.reverse(mA.add(4));
    return mA;
  }
}
