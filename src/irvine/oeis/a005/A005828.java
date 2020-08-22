package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005828 a(n) = 2 a(n-1)^2 - 1.
 * @author Sean A. Irvine
 */
public class A005828 implements Sequence {

  private Z mA = null;

  @Override
  public Z next() {
    mA = mA == null ? Z.FOUR : mA.square().multiply2().subtract(1);
    return mA;
  }
}
