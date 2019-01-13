package irvine.oeis.a008;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A008557.
 * @author Sean A. Irvine
 */
public class A008557 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.EIGHT : new Z(mA.toString(8));
    return mA;
  }
}
