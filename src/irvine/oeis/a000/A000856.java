package irvine.oeis.a000;

import irvine.math.polynomial.CycleIndex;

/**
 * A000856.
 * @author Sean A. Irvine
 */
public class A000856 extends A000859 {

  @Override
  protected CycleIndex iZ2(final int r) {
    return new CycleIndex("I(Z(2))", ia1(r));
  }
}
