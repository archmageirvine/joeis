package irvine.oeis.a061;

import irvine.math.z.Z;

/**
 * A061528 Number of complete games of n X n tic-tac-toe won by O.
 * @author Sean A. Irvine
 */
public class A061528 extends A061526 {

  private int mN = 0;

  @Override
  public Z next() {
    return go(++mN);
  }
}
