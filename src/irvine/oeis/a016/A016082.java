package irvine.oeis.a016;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A016082 Add 4, then reverse the decimal digits; start with 10.
 * @author Sean A. Irvine
 */
public class A016082 extends Sequence1 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.TEN : ZUtils.reverse(mA.add(4));
    return mA;
  }
}
