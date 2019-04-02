package irvine.oeis.a000;

import irvine.math.polynomial.CycleIndex;

/**
 * A000653 Invertible Boolean functions of n variables.
 * @author Sean A. Irvine
 */
public class A000653 extends A000654 {

  @Override
  protected CycleIndex iZ2(final int r) {
    return new CycleIndex("I(Z(2))", ia1(r));
  }
}
