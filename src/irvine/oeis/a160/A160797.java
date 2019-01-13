package irvine.oeis.a160;

import irvine.math.z.Z;

/**
 * A160797.
 * @author Sean A. Irvine
 */
public class A160797 extends A160796 {

  private Z mPrev = super.next();

  @Override
  public Z next() {
    final Z t = super.next();
    final Z r = t.subtract(mPrev);
    mPrev = t;
    return r;
  }
}

