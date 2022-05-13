package irvine.oeis.a056;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A056888.
 * @author Sean A. Irvine
 */
public class A056890 implements Sequence {

  private Z mA = Z.ONE;
  private Z mB = Z.NEG_ONE;
  private long mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    } else if (mN > 1) {
      final Z t = (mN & 1) == 0 ? mB.multiply(mN / 2).add(mA) : mA.subtract(mB);
      mA = mB;
      mB = t;
    }
    return mB;
  }
}
