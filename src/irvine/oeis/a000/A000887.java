package irvine.oeis.a000;

import irvine.math.group.AffineGroupCycleIndex;
import irvine.math.polynomial.CycleIndex;
import irvine.math.z.Z;

/**
 * A000887 Number of switching networks with GL(n,2) acting on the domain and AG(3,2) acting on the range.
 * @author Sean A. Irvine
 */
public class A000887 extends A000721 {

  private static final CycleIndex ZAG3 = AffineGroupCycleIndex.cycleIndex(3);

  @Override
  protected CycleIndex iZ2(final int r) {
    return new CycleIndex("I(Z(2))", ia1(r));
  }

  @Override
  public Z next() {
    return f(++mN).deBruijn(ZAG3);
  }
}
