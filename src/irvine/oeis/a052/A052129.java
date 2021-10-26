package irvine.oeis.a052;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A052129 a(0) = 1; thereafter a(n) = n*a(n-1)^2.
 * @author Sean A. Irvine
 */
public class A052129 implements Sequence {

  private Z mA = Z.ONE;
  private long mN = -1;

  @Override
  public Z next() {
    if (++mN > 1) {
      mA = mA.square().multiply(mN);
    }
    return mA;
  }
}
