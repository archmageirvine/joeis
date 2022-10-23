package irvine.oeis.a013;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A013710 a(n) = 5^(2*n + 1).
 * @author Sean A. Irvine
 */
public class A013710 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.FIVE : mA.multiply(25);
    return mA;
  }
}
