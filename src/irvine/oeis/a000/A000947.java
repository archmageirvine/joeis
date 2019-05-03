package irvine.oeis.a000;

import irvine.math.z.Z;

/**
 * A000947 Number of free nonplanar polyenoids with n nodes and symmetry point group <code>C_{2v}</code>.
 * @author Sean A. Irvine
 */
public class A000947 extends A000063 {

  private final A000936 mPlanar = new A000936();

  {
    for (int k = 1; k < 7; ++k) {
      mPlanar.next();
    }
    super.next();
    super.next();
    super.next();
    super.next();
  }

  @Override
  public Z next() {
    return super.next().subtract(mPlanar.next());
  }
}

