package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013724.
 * @author Sean A. Irvine
 */
public class A013724 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(19) : mA.multiply(361);
    return mA;
  }
}
