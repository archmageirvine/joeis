package irvine.oeis.a001;

import irvine.math.z.Z;

/**
 * A001036.
 * @author Sean A. Irvine
 */
public class A001036 extends A001037 {

  private Z mSum = null;

  @Override
  public Z next() {
    if (mSum == null) {
      super.next();
      super.next();
      mSum = Z.ONE;
    } else {
      mSum = mSum.add(super.next());
    }
    return mSum;
  }
}
