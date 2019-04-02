package irvine.oeis.a000;

import irvine.math.z.Z;

/**
 * A000746 Boustrophedon transform of triangular numbers.
 * @author Sean A. Irvine
 */
public class A000746 extends A000674 {

  // Boustrophedon transform of triangular numbers
  @Override
  protected Z a(final int n) {
    final long m = n + 1;
    return Z.valueOf(m * (m + 1) / 2);
  }
}
