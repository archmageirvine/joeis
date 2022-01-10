package irvine.oeis.a000;

import irvine.math.group.GaloisField;
import irvine.math.group.GeneralLinearGroup;
import irvine.math.polynomial.CycleIndex;
import irvine.math.z.Z;

/**
 * A000875 Number of switching networks with S(n) and C(2,2) acting on the domain and GL(3,2) acting on the range.
 * @author Sean A. Irvine
 */
public class A000875 extends A000721 {

  private static final CycleIndex ZGL3 = new GeneralLinearGroup<>(3, new GaloisField(2)).cycleIndex();

  @Override
  public Z next() {
    return f(++mN).deBruijn(ZGL3);
  }
}
