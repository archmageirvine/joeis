package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A013759 a(n) = 16^(3n + 2).
 * @author Sean A. Irvine
 */
public class A013759 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(256) : mA.shiftLeft(12);
    return mA;
  }
}
