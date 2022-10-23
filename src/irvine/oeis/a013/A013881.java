package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A013881 16^(5*n+4).
 * @author Sean A. Irvine
 */
public class A013881 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(65536) : mA.shiftLeft(20);
    return mA;
  }
}
