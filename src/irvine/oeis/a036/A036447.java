package irvine.oeis.a036;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence;

/**
 * A036447 Double and reverse digits.
 * @author Sean A. Irvine
 */
public class A036447 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ONE : ZUtils.reverse(mA.multiply2());
    return mA;
  }
}
