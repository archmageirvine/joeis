package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A013713 a(n) = 8^(2n+1).
 * @author Sean A. Irvine
 */
public class A013713 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.EIGHT : mA.shiftLeft(6);
    return mA;
  }
}
