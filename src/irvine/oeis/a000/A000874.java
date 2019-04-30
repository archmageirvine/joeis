package irvine.oeis.a000;

import irvine.math.group.GeneralLinearCycleIndex;
import irvine.math.polynomial.CycleIndex;
import irvine.math.z.Z;

/**
 * A000874 Number of switching networks with <code>S(n)</code> and <code>C(2,2)</code> acting on the domain and <code>GL(2,2)</code> acting on the range.
 * @author Sean A. Irvine
 */
public class A000874 extends A000721 {

  private static final CycleIndex ZGL2 = GeneralLinearCycleIndex.cycleIndex(2);

  @Override
  public Z next() {
    return f(++mN).deBruijn(ZGL2);
  }
}
