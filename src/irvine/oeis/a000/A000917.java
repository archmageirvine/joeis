package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000917 a(n) = (2n+3)!/(n!*(n+2)!).
 * @author Sean A. Irvine
 */
public class A000917 implements Sequence {

  private long mN = -1;
  private Z mA = Z.THREE;

  @Override
  public Z next() {
    if (++mN > 0) {
      mA = mA.multiply2().multiply(mN + 1).multiply(2 * mN + 3).divide(mN).divide(mN + 2);
    }
    return mA;
  }
}

