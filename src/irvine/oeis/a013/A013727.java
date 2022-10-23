package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A013727 a(n) = 22^(2*n + 1).
 * @author Sean A. Irvine
 */
public class A013727 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(22) : mA.multiply(484);
    return mA;
  }
}
