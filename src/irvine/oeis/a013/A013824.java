package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013824.
 * @author Sean A. Irvine
 */
public class A013824 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.EIGHT : mA.shiftLeft(5);
    return mA;
  }
}
