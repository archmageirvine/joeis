package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A013718 a(n) = 13^(2*n + 1).
 * @author Sean A. Irvine
 */
public class A013718 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(13) : mA.multiply(169);
    return mA;
  }
}
