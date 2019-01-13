package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A008561.
 * @author Sean A. Irvine
 */
public class A008561 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.THREE : (mA.equals(Z.THREE) ? Z.valueOf(11) : new Z(new Z(mA.toString(), 3).toString(2)));
    return mA;
  }
}
