package irvine.oeis.a061;

import irvine.math.z.Z;

/**
 * A061529 Number of complete games of n X n tic-tac-toe ending in a draw.
 * @author Sean A. Irvine
 */
public class A061529 extends A061526 {

  private int mN = 0;

  @Override
  public Z next() {
    return gc(++mN);
  }
}
