package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A013777 a(n) = 2^(4*n + 3).
 * @author Sean A. Irvine
 */
public class A013777 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.EIGHT : mA.shiftLeft(4);
    return mA;
  }
}
