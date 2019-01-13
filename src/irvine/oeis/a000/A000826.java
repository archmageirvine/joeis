package irvine.oeis.a000;

import irvine.math.polynomial.CycleIndex;
import irvine.math.z.Z;

/**
 * A000826.
 * @author Sean A. Irvine
 */
public class A000826 extends A000721 {

  @Override
  protected CycleIndex iZ2(final int r) {
    return new CycleIndex("I(Z(2))", ia1(r));
  }

  @Override
  public Z next() {
    final CycleIndex ans = f(++mN);
    return ans.apply(2).add(ans.apply(1, 2)).divide(2).toZ();
  }
}
