package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000172.
 * @author Sean A. Irvine
 */
public class A000172 implements Sequence {

  private long mN = -1;
  private Z mA = Z.ONE;
  private Z mB = Z.TWO;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    } else if (mN == 1) {
      return Z.TWO;
    }
    final Z r = mB.multiply(7 * mN * mN - 7 * mN + 2).add(mA.multiply((mN - 1) * (mN - 1)).shiftLeft(3)).divide(mN * mN);
    mA = mB;
    mB = r;
    return r;
  }
}
