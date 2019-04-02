package irvine.oeis.a000;

import irvine.math.polynomial.CycleIndex;
import irvine.math.z.Z;

/**
 * A000811 Number of switching networks (see Harrison reference for precise definition).
 * @author Sean A. Irvine
 */
public class A000811 extends A000721 {

  @Override
  protected CycleIndex iZ2(final int r) {
    return new CycleIndex("I(Z(2))", ia1(r));
  }

  @Override
  public Z next() {
    return f(++mN).apply(2).toZ();
  }
}
