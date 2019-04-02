package irvine.oeis.a000;

import irvine.math.z.Z;

/**
 * A000778 a(n) = Catalan(n) + Catalan(n+1) - 1.
 * @author Sean A. Irvine
 */
public class A000778 extends A000108 {

  private Z mPrev = super.next();

  @Override
  public Z next() {
    final Z r = mPrev;
    mPrev = super.next();
    return r.add(mPrev).subtract(1);
  }
}
