package irvine.oeis.a067;

import irvine.math.z.Z;

/**
 * A067303 Even-indexed members of A067302.
 * @author Sean A. Irvine
 */
public class A067303 extends A067302 {

  @Override
  public Z next() {
    final Z res = super.next();
    super.next();
    return res;
  }
}
