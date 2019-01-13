package irvine.oeis.a001;

import irvine.math.z.Z;

/**
 * A001555.
 * @author Sean A. Irvine
 */
public class A001555 extends A001554 {

  private Z mEight = null;

  @Override
  public Z next() {
    if (mEight == null) {
      mEight = Z.ONE;
    } else {
      mEight = mEight.shiftLeft(3);
    }
    return mEight.add(super.next());
  }
}
