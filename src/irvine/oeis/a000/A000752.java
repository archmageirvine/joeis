package irvine.oeis.a000;

import irvine.math.z.Z;

/**
 * A000752.
 * @author Sean A. Irvine
 */
public class A000752 extends A000674 {

  // Boustrophedon transform of powers of 2
  @Override
  protected Z a(final int n) {
    return Z.ONE.shiftLeft(n);
  }
}
