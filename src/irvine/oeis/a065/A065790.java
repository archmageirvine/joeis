package irvine.oeis.a065;

import irvine.math.z.Z;

/**
 * A065790 a(1) = 64; for n &gt; 1, a(n) is the smallest integer &gt; 0 such that the concatenation a(n)a(n-1)...a(2)a(1) is a square.
 * @author Sean A. Irvine
 */
public class A065790 extends A065788 {

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
