package irvine.oeis.a000;

import irvine.math.z.Z;

/**
 * A000953.
 * @author Sean A. Irvine
 */
public class A000953 extends A000207 {

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

