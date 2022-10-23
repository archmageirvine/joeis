package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A004171 a(n) = 2^(2n+1).
 * @author Sean A. Irvine
 */
public class A004171 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.TWO : mA.shiftLeft(2);
    return mA;
  }
}
