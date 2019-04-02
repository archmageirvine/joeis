package irvine.oeis.a001;

import irvine.math.z.Z;
import irvine.oeis.a000.A000905;

/**
 * A001660 Hypotenusal numbers.
 * @author Sean A. Irvine
 */
public class A001660 extends A000905 {

  private Z mPrev = null;

  @Override
  public Z next() {
    if (mPrev == null) {
      mPrev = super.next();
      return Z.ONE;
    }
    final Z t = super.next();
    final Z r = t.subtract(mPrev);
    mPrev = t;
    return r;
  }
}
