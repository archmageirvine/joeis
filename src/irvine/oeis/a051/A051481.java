package irvine.oeis.a051;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A051481 a(n+1) = a(n)^2 + n*(n+3)*a(n).
 * @author Sean A. Irvine
 */
public class A051481 implements Sequence {

  private Z mA = Z.ONE;
  private long mN = -1;

  @Override
  public Z next() {
    if (++mN > 0) {
      mA = mA.square().add(mA.multiply(mN).multiply(mN + 3));
    }
    return mA;
  }
}
