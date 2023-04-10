package irvine.oeis.a062;

import irvine.math.z.Z;

/**
 * A062844.
 * @author Sean A. Irvine
 */
public class A062856 extends A062857 {

  @Override
  public Z next() {
    super.next();
    return Z.valueOf(mMaxCountMinValue);
  }
}
