package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013742.
 * @author Sean A. Irvine
 */
public class A013742 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.EIGHT : mA.shiftLeft(9);
    return mA;
  }
}
