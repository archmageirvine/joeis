package irvine.oeis.a000;

import irvine.math.group.GaloisField;
import irvine.math.group.GeneralLinearGroup;
import irvine.math.polynomial.CycleIndex;
import irvine.math.z.Z;

/**
 * A000874 Number of switching networks with S(n) and C(2,2) acting on the domain and GL(2,2) acting on the range.
 * @author Sean A. Irvine
 */
public class A000874 extends A000721 {

  private static final CycleIndex ZGL2 = new GeneralLinearGroup<>(2, new GaloisField(2)).cycleIndex();

  @Override
  public Z next() {
    return f(++mN).deBruijn(ZGL2);
  }
}
