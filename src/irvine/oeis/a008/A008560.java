package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A008560.
 * @author Sean A. Irvine
 */
public class A008560 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.TWO : new Z(new Z(mA.toString(), 3).toString(2));
    return mA;
  }
}
