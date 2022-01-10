package irvine.oeis.a000;

import irvine.math.group.GaloisField;
import irvine.math.group.GeneralLinearGroup;
import irvine.math.polynomial.CycleIndex;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000878 Number of switching networks with GL(n,2) acting on the domain and GL(2,2) acting on the range.
 * @author Sean A. Irvine
 */
public class A000878 implements Sequence {

  private static final CycleIndex ZGL3 = new GeneralLinearGroup<>(3, new GaloisField(2)).cycleIndex();

  private int mN = 0;

  @Override
  public Z next() {
    final int n = ++mN;
    return new GeneralLinearGroup<>(n, new GaloisField(2)).cycleIndex().deBruijn(ZGL3);
  }
}
