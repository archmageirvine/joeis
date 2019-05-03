package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005572 Number of walks on cubic lattice starting and finishing on the xy plane and never going below it.
 * @author Sean A. Irvine
 */
public class A005572 implements Sequence {

  private long mN = 0;
  private Z mA = Z.ZERO;
  private Z mB = null;

  @Override
  public Z next() {
    if (mB == null) {
      mB = Z.ONE;
    } else {
      ++mN;
      final Z t = mB.multiply(2 * mN + 1).subtract(mA.multiply(mN - 1).multiply(3)).multiply(4).divide(mN + 2);
      mA = mB;
      mB = t;
    }
    return mB;
  }
}

