package irvine.oeis.a000;

import irvine.math.z.Z;

/**
 * A000618 Nondegenerate Boolean functions of n variables.
 * @author Sean A. Irvine
 */
public class A000618 extends A000616 {

  private Z mPrev = Z.ZERO;
  {
    super.next();
  }

  @Override
  public Z next() {
    final Z t = super.next();
    final Z r = t.subtract(mPrev);
    mPrev = t;
    return r;
  }
}
