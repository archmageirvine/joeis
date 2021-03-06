package irvine.oeis.a000;

import irvine.math.z.Z;

/**
 * A000745 Boustrophedon transform of squares.
 * @author Sean A. Irvine
 */
public class A000745 extends A000674 {

  // Boustrophedon transform of squares
  @Override
  protected Z a(final int n) {
    final long m = n + 1;
    return Z.valueOf(m * m);
  }
}
