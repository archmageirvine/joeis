package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A013865 a(n) = 12^(5*n + 4).
 * @author Sean A. Irvine
 */
public class A013865 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(20736) : mA.multiply(248832);
    return mA;
  }
}
