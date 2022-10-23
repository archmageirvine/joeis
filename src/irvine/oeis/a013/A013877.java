package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A013877 a(n) = 15^(5*n + 4).
 * @author Sean A. Irvine
 */
public class A013877 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.valueOf(50625) : mA.multiply(759375);
    return mA;
  }
}
