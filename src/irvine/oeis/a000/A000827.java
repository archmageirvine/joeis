package irvine.oeis.a000;

import irvine.math.polynomial.CycleIndex;
import irvine.math.z.Z;

/**
 * A000827 Number of switching networks (see Harrison reference for precise definition).
 * @author Sean A. Irvine
 */
public class A000827 extends A000721 {

  @Override
  protected CycleIndex iZ2(final int r) {
    return new CycleIndex("I(Z(2))", ia1(r));
  }

  @Override
  public Z next() {
    final CycleIndex ans = f(++mN);
    return ans.apply(3)
      .add(ans.apply(2, 3).multiply(3))
      .add(ans.apply(1, 1, 3).multiply(2))
      .divide(6).toZ();
  }
}
