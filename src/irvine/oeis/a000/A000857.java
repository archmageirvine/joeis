package irvine.oeis.a000;

import irvine.math.polynomial.CycleIndex;

/**
 * A000857 Number of n-input 3-output switching networks under the action of S(n) on the inputs and S(3) and complementing group C(2,3) on the outputs.
 * @author Sean A. Irvine
 */
public class A000857 extends A000860 {

  @Override
  protected CycleIndex iZ2(final int r) {
    return new CycleIndex("I(Z(2))", ia1(r));
  }
}
