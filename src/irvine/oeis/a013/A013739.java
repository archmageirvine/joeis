package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013739.
 * @author Sean A. Irvine
 */
public class A013739 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(36) : mA.multiply(216);
    return mA;
  }
}
