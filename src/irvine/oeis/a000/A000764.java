package irvine.oeis.a000;

import irvine.math.z.Z;

/**
 * A000764 Boustrophedon transform of Bell numbers.
 * @author Sean A. Irvine
 */
public class A000764 extends A000674 {

  private final A000110 mBell = new A000110();

  // Boustrophedon transform
  @Override
  protected Z a(final int n) {
    return mBell.next();
  }
}
