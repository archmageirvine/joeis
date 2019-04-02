package irvine.oeis.a000;

import irvine.math.group.GeneralLinearCycleIndex;
import irvine.math.polynomial.CycleIndex;
import irvine.math.z.Z;

/**
 * A000872 Number of switching networks with S(n) acting on the domain and GL(3,2) acting on the range.
 * @author Sean A. Irvine
 */
public class A000872 extends A000721 {

  private static final CycleIndex ZGL3 = GeneralLinearCycleIndex.cycleIndex(3);

  @Override
  protected CycleIndex iZ2(final int r) {
    return new CycleIndex("I(Z(2))", ia1(r));
  }

  @Override
  public Z next() {
    return f(++mN).deBruijn(ZGL3);
  }
}
