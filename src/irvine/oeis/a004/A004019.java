package irvine.oeis.a004;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A004019 a(0) = 0; for n &gt; 0, a(n) = (a(n-1) + 1)^2.
 * @author Sean A. Irvine
 */
public class A004019 extends Sequence0 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.ZERO : mA.add(1).square();
    return mA;
  }
}
