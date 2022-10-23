package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A013758 a(n) = 16^(3n+1).
 * @author Sean A. Irvine
 */
public class A013758 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(16) : mA.shiftLeft(12);
    return mA;
  }
}
