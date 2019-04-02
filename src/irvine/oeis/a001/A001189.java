package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001189 Number of degree-n permutations of order exactly 2.
 * @author Sean A. Irvine
 */
public class A001189 implements Sequence {

  private int mN = 1;
  private Z mA = null;
  private Z mB = null;

  @Override
  public Z next() {
    if (mA == null) {
      mA = Z.ZERO;
      return Z.ZERO;
    }
    if (mB == null) {
      mB = Z.ONE;
      return Z.ONE;
    }
    final Z t = mB.add(mA.add(1).multiply(++mN));
    mA = mB;
    mB = t;
    return t;
  }
}
