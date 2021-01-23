package irvine.oeis.a002;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002627 a(n) = n*a(n-1) + 1, a(0) = 0.
 * @author Sean A. Irvine
 */
public class A002627 implements Sequence {

  private Z mA = Z.ZERO;
  private long mN = -1;

  @Override
  public Z next() {
    if (++mN > 0) {
      mA = mA.multiply(mN).add(1);
    }
    return mA;
  }
}
