package irvine.oeis.a000;

import irvine.math.polynomial.CycleIndex;

/**
 * A000841 Number of n-input 2-output switching networks under action of symmetric group S(n) on the inputs and complementing group C(2,2) on the outputs.
 * @author Sean A. Irvine
 */
public class A000841 extends A000844 {

  @Override
  protected CycleIndex iZ2(final int r) {
    return new CycleIndex("I(Z(2))", ia1(r));
  }
}
