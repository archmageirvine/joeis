package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A008559.
 * @author Sean A. Irvine
 */
public class A008559 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.TWO : new Z(mA.toString(2));
    return mA;
  }
}
