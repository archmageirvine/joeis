package irvine.oeis.a175;

import irvine.math.z.Z;

/**
 * A175499 <code>a(n) =</code> A175498(n+1)-A175498(n).
 * @author Sean A. Irvine
 */
public class A175499 extends A175498 {

  private Z mPrev = super.next();

  @Override
  public Z next() {
    final Z t = super.next();
    final Z r = t.subtract(mPrev);
    mPrev = t;
    return r;
  }
}

