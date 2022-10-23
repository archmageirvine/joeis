package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A013717 a(n) = 12^(2*n + 1).
 * @author Sean A. Irvine
 */
public class A013717 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(12) : mA.multiply(144);
    return mA;
  }
}
