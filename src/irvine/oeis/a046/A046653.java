package irvine.oeis.a046;

import irvine.math.z.Z;

/**
 * A046653 Triangle of rooted planar maps.
 * @author Sean A. Irvine
 */
public class A046653 extends A046650 {

  private int mN = 1;
  private int mM = 0;

  @Override
  public Z next() {
    if (--mM < 2) {
      mM = ++mN;
    }
    return l(mN, mM);
  }
}
