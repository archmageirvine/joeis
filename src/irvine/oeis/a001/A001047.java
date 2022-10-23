package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A001047 a(n) = 3^n - 2^n.
 * @author Sean A. Irvine
 */
public class A001047 extends Sequence0 {

  private Z mTwo = null;
  private Z mThree = Z.ONE;

  @Override
  public Z next() {
    if (mTwo == null) {
      mTwo = Z.ONE;
    } else {
      mTwo = mTwo.multiply2();
      mThree = mThree.multiply(3);
    }
    return mThree.subtract(mTwo);
  }
}
