package irvine.oeis.a000;

import irvine.math.z.Z;

/**
 * A000756 Boustrophedon transform of sequence 1,1,0,0,0,0,...
 * @author Sean A. Irvine
 */
public class A000756 extends A000674 {

  // Boustrophedon transform
  @Override
  protected Z a(final int n) {
    return n < 2 ? Z.ONE : Z.ZERO;
  }
}
