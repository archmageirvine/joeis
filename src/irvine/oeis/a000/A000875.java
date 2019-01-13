package irvine.oeis.a000;

import irvine.math.group.GeneralLinearCycleIndex;
import irvine.math.polynomial.CycleIndex;
import irvine.math.z.Z;

/**
 * A000875.
 * @author Sean A. Irvine
 */
public class A000875 extends A000721 {

  private static final CycleIndex ZGL3 = GeneralLinearCycleIndex.cycleIndex(3);

  @Override
  public Z next() {
    return f(++mN).deBruijn(ZGL3);
  }
}
