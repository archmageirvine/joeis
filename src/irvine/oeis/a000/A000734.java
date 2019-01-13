package irvine.oeis.a000;

import irvine.math.z.Z;

/**
 * A000734.
 * @author Sean A. Irvine
 */
public class A000734 extends A000674 {

  // Boustrophedon transform
  @Override
  protected Z a(final int n) {
    return n == 0 ? Z.ONE : Z.ONE.shiftLeft(n - 1);
  }
}
