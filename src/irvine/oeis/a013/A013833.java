package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A013833 a(n) = 4^(5*n + 4).
 * @author Sean A. Irvine
 */
public class A013833 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(256) : mA.shiftLeft(10);
    return mA;
  }
}
