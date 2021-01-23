package irvine.oeis.a000;

import irvine.math.polynomial.CycleIndex;

/**
 * A000856 Number of n-input 2-output switching networks under the action of S(n) on the inputs and S(2) and complementing group C(2,2) on the outputs.
 * @author Sean A. Irvine
 */
public class A000856 extends A000859 {

  @Override
  protected CycleIndex iZ2(final int r) {
    return new CycleIndex("I(Z(2))", ia1(r));
  }
}
