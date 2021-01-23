package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001566 a(0) = 3; thereafter, a(n) = a(n-1)^2 - 2.
 * @author Sean A. Irvine
 */
public class A001566 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.THREE : mA.square().subtract(2);
    return mA;
  }
}
