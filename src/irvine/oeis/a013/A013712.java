package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013712.
 * @author Sean A. Irvine
 */
public class A013712 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.SEVEN : mA.multiply(49);
    return mA;
  }
}
