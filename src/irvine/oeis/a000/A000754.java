package irvine.oeis.a000;

import irvine.math.z.Z;

/**
 * A000754.
 * @author Sean A. Irvine
 */
public class A000754 extends A000674 {

  // Boustrophedon transform
  @Override
  protected Z a(final int n) {
    return Z.valueOf(2L * n + 1);
  }
}
