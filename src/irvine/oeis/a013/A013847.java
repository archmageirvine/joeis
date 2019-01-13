package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013847.
 * @author Sean A. Irvine
 */
public class A013847 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(64) : mA.shiftLeft(15);
    return mA;
  }
}
