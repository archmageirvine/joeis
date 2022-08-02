package irvine.oeis.a058;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A058294 Successive rows of a triangle, the columns of which are generalized Fibonacci sequences S(j).
 * @author Sean A. Irvine
 */
public class A058294 implements Sequence {

  private int mN = 0;
  private int mM = 0;
  private Z mA = null;
  private Z mB = null;

  @Override
  public Z next() {
    if (++mM >= 2 * mN) {
      ++mN;
      mM = 1;
      mA = Z.ZERO;
      mB = Z.ONE;
    } else if (mM <= mN) {
      final Z t = mB.multiply(mN - mM + 1).add(mA);
      mA = mB;
      mB = t;
    } else if (mM == mN + 1) {
      final Z t = mA;
      mA = mB;
      mB = t;
    } else {
      final Z t = mA.subtract(mB.multiply(mM - mN - 1));
      mA = mB;
      mB = t;
    }
    return mB;
  }
}
