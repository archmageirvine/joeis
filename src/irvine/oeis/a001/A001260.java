package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001260 Number of permutations of length n with 4 consecutive ascending pairs.
 * @author Sean A. Irvine
 */
public class A001260 implements Sequence {

  private long mN = -4;
  private Z mA = Z.ZERO;
  private Z mB = Z.ONE;

  @Override
  public Z next() {
    if (++mN < 1) {
      return Z.ZERO;
    }
    if (mN > 1) {
      final Z t = mB.multiply(mN - 1).add(mA.multiply(mN + 2)).multiply(mN + 3).divide(mN - 1);
      mA = mB;
      mB = t;
    }
    return mB;
  }
}

