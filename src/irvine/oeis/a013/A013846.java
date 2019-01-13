package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013846.
 * @author Sean A. Irvine
 */
public class A013846 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.EIGHT : mA.shiftLeft(15);
    return mA;
  }
}
