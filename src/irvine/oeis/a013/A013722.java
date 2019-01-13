package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013722.
 * @author Sean A. Irvine
 */
public class A013722 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(17) : mA.multiply(289);
    return mA;
  }
}
