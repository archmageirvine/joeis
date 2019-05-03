package irvine.oeis.a000;

import irvine.math.z.Z;

/**
 * A000948 Number of free nonplanar polyenoids with n nodes and symmetry point group <code>C_s</code>.
 * @author Sean A. Irvine
 */
public class A000948 extends A000131 {

  private final A000941 mPlanar = new A000941();

  {
    for (int k = 1; k < 7; ++k) {
      mPlanar.next();
    }
    super.next();
    super.next();
  }

  @Override
  public Z next() {
    return super.next().subtract(mPlanar.next());
  }
}

