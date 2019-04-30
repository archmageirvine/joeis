package irvine.oeis.a000;

import irvine.math.group.GeneralLinearCycleIndex;
import irvine.math.polynomial.CycleIndex;
import irvine.math.z.Z;

/**
 * A000875 Number of switching networks with <code>S(n)</code> and <code>C(2,2)</code> acting on the domain and <code>GL(3,2)</code> acting on the range.
 * @author Sean A. Irvine
 */
public class A000875 extends A000721 {

  private static final CycleIndex ZGL3 = GeneralLinearCycleIndex.cycleIndex(3);

  @Override
  public Z next() {
    return f(++mN).deBruijn(ZGL3);
  }
}
