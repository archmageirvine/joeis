package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013786.
 * @author Sean A. Irvine
 */
public class A013786 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.SEVEN : mA.multiply(2401);
    return mA;
  }
}
