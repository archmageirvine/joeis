package irvine.oeis.a160;

import irvine.math.z.Z;

/**
 * A160793.
 * @author Sean A. Irvine
 */
public class A160793 extends A160792 {

  private Z mPrev = super.next();

  @Override
  public Z next() {
    final Z t = super.next();
    final Z r = t.subtract(mPrev);
    mPrev = t;
    return r;
  }
}

