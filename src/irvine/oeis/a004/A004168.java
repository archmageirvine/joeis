package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A004168 a(n+1) = a(n)*(a(n)+1).
 * @author Sean A. Irvine
 */
public class A004168 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.THREE : mA.multiply(mA.add(1));
    return mA;
  }
}
