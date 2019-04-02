package irvine.oeis.a000;

import irvine.math.z.Z;

/**
 * A000753 Boustrophedon transform of Catalan numbers.
 * @author Sean A. Irvine
 */
public class A000753 extends A000674 {

  private final A000108 mCatalan = new A000108();

  // Boustrophedon transform
  @Override
  protected Z a(final int n) {
    return mCatalan.next();
  }
}
