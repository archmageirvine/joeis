package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001117 a(n) = 3^n - 3*2^n + 3.
 * @author Sean A. Irvine
 */
public class A001117 implements Sequence {

  private Z mThree = Z.ONE;
  private Z mTwo = Z.THREE;
  private boolean mDoneFirst = false;

  @Override
  public Z next() {
    if (mDoneFirst) {
      mThree = mThree.multiply(3);
      mTwo = mTwo.multiply2();
    } else {
      mDoneFirst = true;
    }
    return mThree.subtract(mTwo).add(3);
  }
}

