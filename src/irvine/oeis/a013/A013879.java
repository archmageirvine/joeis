package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A013879 a(n) = 16^(5*n + 2).
 * @author Sean A. Irvine
 */
public class A013879 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(256) : mA.shiftLeft(20);
    return mA;
  }
}
