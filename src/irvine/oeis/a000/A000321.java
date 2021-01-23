package irvine.oeis.a000;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000321 H_n(-1/2), where H_n(x) is Hermite polynomial of degree n.
 * @author Sean A. Irvine
 */
public class A000321 implements Sequence {

  private Z mA = Z.ONE;
  private Z mB = Z.NEG_ONE;
  private int mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return mA;
    } else if (mN != 1) {
      final Z t = mB.negate().subtract(mA.multiply(2 * (mN - 1)));
      mA = mB;
      mB = t;
    }
    return mB;
  }
}
