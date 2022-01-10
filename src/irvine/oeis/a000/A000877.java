package irvine.oeis.a000;

import irvine.math.group.GaloisField;
import irvine.math.group.GeneralLinearGroup;
import irvine.math.polynomial.CycleIndex;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000877 Number of switching networks with GL(n,2) acting on the domain and GL(2,2) acting on the range.
 * @author Sean A. Irvine
 */
public class A000877 implements Sequence {

  private static final CycleIndex ZGL2 = new GeneralLinearGroup<>(2, new GaloisField(2)).cycleIndex();

  private int mN = 0;

  @Override
  public Z next() {
    final int n = ++mN;
    return new GeneralLinearGroup<>(n, new GaloisField(2)).cycleIndex().deBruijn(ZGL2);
  }
}
