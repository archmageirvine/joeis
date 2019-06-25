package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A024216.
 * @author Sean A. Irvine
 */
public class A024216 implements Sequence {

  private long mN = -1;
  private Z mA = Z.ONE;
  private Z mB = Z.FIVE;

  @Override
  public Z next() {
    if (++mN < 2) {
      if (mN == 0) {
        return Z.ONE;
      }
    } else {
      final Z t = mB.multiply(6 * mN - 1).subtract(mA.multiply(3 * mN - 2).multiply(3 * mN - 2));
      mA = mB;
      mB = t;
    }
    return mB;
  }
}

