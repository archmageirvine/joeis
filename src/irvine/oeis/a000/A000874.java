package irvine.oeis.a000;

import irvine.math.group.GeneralLinearCycleIndex;
import irvine.math.polynomial.CycleIndex;
import irvine.math.z.Z;

/**
 * A000874.
 * @author Sean A. Irvine
 */
public class A000874 extends A000721 {

  private static final CycleIndex ZGL2 = GeneralLinearCycleIndex.cycleIndex(2);

  @Override
  public Z next() {
    return f(++mN).deBruijn(ZGL2);
  }
}
