package irvine.oeis.a000;

import irvine.math.z.Z;

/**
 * A000737.
 * @author Sean A. Irvine
 */
public class A000737 extends A000674 {

  // Boustrophedon transform
  @Override
  protected Z a(final int n) {
    return Z.valueOf(n + 1);
  }
}
