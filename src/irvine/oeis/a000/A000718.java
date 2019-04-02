package irvine.oeis.a000;

import irvine.math.z.Z;

/**
 * A000718 Boustrophedon transform of triangular numbers 1,1,3,6,10,...
 * @author Sean A. Irvine
 */
public class A000718 extends A000674 {

  private final A000217 mTriangular = new A000217();

  @Override
  protected Z a(final int n) {
    final Z t = mTriangular.next();
    return n == 0 ? Z.ONE : t;
  }
}
