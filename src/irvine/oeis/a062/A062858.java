package irvine.oeis.a062;

import irvine.math.z.Z;

/**
 * A062844.
 * @author Sean A. Irvine
 */
public class A062858 extends A062859 {

  @Override
  public Z next() {
    super.next();
    return Z.valueOf(mMaxCountMinValue);
  }
}
