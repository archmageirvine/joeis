package irvine.oeis.a065;

import irvine.math.z.Z;

/**
 * A065784 a(1) = 36; for n &gt; 1 is a(n) the smallest integer &gt; 0 such that the concatenation a(n)a(n-1)...a(2)a(1) is a square.
 * @author Sean A. Irvine
 */
public class A065784 extends A065782 {

  private boolean mFirst = true;

  @Override
  public Z next() {
    if (mFirst) {
      mFirst = false;
      return super.next();
    }
    return super.next().divide(mT);
  }
}
