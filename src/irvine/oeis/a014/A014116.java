package irvine.oeis.a014;

import irvine.math.z.Z;

/**
 * A014116.
 * @author Sean A. Irvine
 */
public class A014116 extends A014115 {

  @Override
  public Z next() {
    final Z a = super.next();
    return mN == 3 ? Z.valueOf(696729600) : a;
  }
}
