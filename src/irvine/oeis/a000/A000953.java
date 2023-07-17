package irvine.oeis.a000;

import irvine.math.z.Z;

/**
 * A000953 Number of free nonplanar polyenoids with n nodes.
 * @author Sean A. Irvine
 */
public class A000953 extends A000207 {

  /** Construct the sequence. */
  public A000953() {
    super(7);
  }

  private final A000942 mPlanar = new A000942();

  {
    for (int k = 1; k < 7; ++k) {
      super.next();
      mPlanar.next();
    }
  }

  @Override
  public Z next() {
    return super.next().subtract(mPlanar.next());
  }
}

