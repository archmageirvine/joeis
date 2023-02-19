package irvine.oeis.a061;

import irvine.math.z.Z;

/**
 * A061527 Number of complete games of n X n tic-tac-toe won by X.
 * @author Sean A. Irvine
 */
public class A061527 extends A061526 {

  private int mN = 0;

  @Override
  public Z next() {
    return gx(++mN);
  }
}
