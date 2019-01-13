package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013858.
 * @author Sean A. Irvine
 */
public class A013858 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(11) : mA.multiply(161051);
    return mA;
  }
}
