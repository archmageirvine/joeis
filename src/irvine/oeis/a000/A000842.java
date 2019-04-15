package irvine.oeis.a000;

import irvine.math.polynomial.CycleIndex;

/**
 * A000842 Number of n-input 3-output switching networks under action of symmetric group S(n) on the inputs and complementing group <code>C(3,2)</code> on the outputs.
 * @author Sean A. Irvine
 */
public class A000842 extends A000845 {

  @Override
  protected CycleIndex iZ2(final int r) {
    return new CycleIndex("I(Z(2))", ia1(r));
  }

}
