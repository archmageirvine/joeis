package irvine.oeis.a065;

import irvine.math.z.Z;
import irvine.oeis.a061.A061839;

/**
 * A065781 a(1) = 25; for n &gt; 1 is a(n) the smallest integer &gt; 0 such that the concatenation a(n)a(n-1)...a(2)a(1) is a square.
 * @author Sean A. Irvine
 */
public class A065781 extends A061839 {

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
