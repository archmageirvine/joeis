package irvine.oeis.a129;

import irvine.math.z.Z;

/**
 * A129646.
 * @author Sean A. Irvine
 */
public class A129646 extends A129645 {

  private Z mPrev = super.next();

  @Override
  public Z next() {
    final Z t = super.next();
    final Z r = t.subtract(1).divide(mPrev);
    mPrev = t;
    return r;
  }
}

