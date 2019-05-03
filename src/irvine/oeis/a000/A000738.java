package irvine.oeis.a000;

import irvine.math.z.Z;

/**
 * A000738 Boustrophedon transform <code>(first version)</code> of Fibonacci numbers 0,1,1,2,3,...
 * @author Sean A. Irvine
 */
public class A000738 extends A000674 {

  private final A000045 mFibo = new A000045();

  // Boustrophedon transform
  @Override
  protected Z a(final int n) {
    return mFibo.next();
  }
}
