package irvine.oeis.a000;

import irvine.math.polynomial.CycleIndex;

/**
 * A000857.
 * @author Sean A. Irvine
 */
public class A000857 extends A000860 {

  @Override
  protected CycleIndex iZ2(final int r) {
    return new CycleIndex("I(Z(2))", ia1(r));
  }
}
