package irvine.oeis.a000;

import irvine.math.z.Z;

/**
 * A000736 Boustrophedon transform of Catalan numbers 1, 1, 1, 2, 5, 14, ...
 * @author Sean A. Irvine
 */
public class A000736 extends A000674 {

  private final A000108 mCatalan = new A000108();

  // Boustrophedon transform
  @Override
  protected Z a(final int n) {
    return n == 0 ? Z.ONE : mCatalan.next();
  }
}
