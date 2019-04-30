package irvine.oeis.a000;

import irvine.math.z.Z;

/**
 * A000744 Boustrophedon transform (second version) of Fibonacci numbers <code>1,1,2,3,... </code>...
 * @author Sean A. Irvine
 */
public class A000744 extends A000674 {

  private final A000045 mFibo = new A000045();
  {
    mFibo.next();
  }

  // Boustrophedon transform
  @Override
  protected Z a(final int n) {
    return mFibo.next();
  }
}
