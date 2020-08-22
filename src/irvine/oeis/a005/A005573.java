package irvine.oeis.a005;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005573 Number of walks on cubic lattice (starting from origin and not going below xy plane).
 * @author Sean A. Irvine
 */
public class A005573 implements Sequence {

  private long mN = 0;
  private Z mA = Z.ZERO;
  private Z mB = null;

  @Override
  public Z next() {
    if (mB == null) {
      mB = Z.ONE;
    } else {
      ++mN;
      final Z t = mB.multiply(8 * mN + 2).subtract(mA.multiply(12 * mN - 12)).divide(mN + 1);
      mA = mB;
      mB = t;
    }
    return mB;
  }
}

