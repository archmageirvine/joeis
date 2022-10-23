package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A013878 a(n) = 16^(5*n + 1).
 * @author Sean A. Irvine
 */
public class A013878 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(16) : mA.shiftLeft(20);
    return mA;
  }
}
