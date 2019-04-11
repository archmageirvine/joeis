package irvine.oeis.a000;

import irvine.math.z.Z;

/**
 * A000697 Boustrophedon transform of <code>1, 1, 4, 9, 16, ..</code>.
 * @author Sean A. Irvine
 */
public class A000697 extends A000674 {

  @Override
  protected Z a(final int n) {
    return n == 0 ? Z.ONE : Z.valueOf(n).square();
  }
}
