package irvine.oeis.a003;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A003608 Add 4, then reverse digits.
 * @author Sean A. Irvine
 */
public class A003608 implements Sequence {

  private Z mA = Z.valueOf(-4);

  @Override
  public Z next() {
    mA = ZUtils.reverse(mA.add(4));
    return mA;
  }
}
