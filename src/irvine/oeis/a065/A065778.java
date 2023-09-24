package irvine.oeis.a065;

import irvine.math.z.Z;

/**
 * A065778 a(1) = 16; for n &gt; 1, a(n) is the smallest integer &gt; 0 such that the concatenation a(n)a(n-1)...a(2)a(1) is a square.
 * @author Sean A. Irvine
 */
public class A065778 extends A065776 {

  private boolean mFirst = true;

  @Override
  public Z next() {
    if (mFirst) {
      mFirst = false;
      super.next();
      return super.next();
    }
    return super.next().divide(mT);
  }
}
