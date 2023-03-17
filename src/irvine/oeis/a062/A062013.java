package irvine.oeis.a062;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A062013 a(1) = 3, a(n) = a(n-1)^2 + 1.
 * @author Sean A. Irvine
 */
public class A062013 extends Sequence1 {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.THREE : mA.square().add(1);
    return mA;
  }
}
