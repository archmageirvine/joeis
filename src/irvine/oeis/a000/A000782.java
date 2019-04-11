package irvine.oeis.a000;

import irvine.math.z.Z;

/**
 * A000782 <code>a(n) =</code> 2*Catalan(n)-Catalan(n-1).
 * @author Sean A. Irvine
 */
public class A000782 extends A000108 {

  private Z mPrev = super.next();

  @Override
  public Z next() {
    final Z r = mPrev;
    mPrev = super.next();
    return mPrev.multiply2().subtract(r);
  }
}
