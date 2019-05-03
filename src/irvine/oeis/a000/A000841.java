package irvine.oeis.a000;

import irvine.math.polynomial.CycleIndex;

/**
 * A000841 Number of <code>n-input 2-output</code> switching networks under action of symmetric group <code>S(n)</code> on the inputs and complementing group <code>C(2,2)</code> on the outputs.
 * @author Sean A. Irvine
 */
public class A000841 extends A000844 {

  @Override
  protected CycleIndex iZ2(final int r) {
    return new CycleIndex("I(Z(2))", ia1(r));
  }
}
