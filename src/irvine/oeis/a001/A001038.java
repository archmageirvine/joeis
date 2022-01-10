package irvine.oeis.a001;

import irvine.math.group.GaloisField;
import irvine.math.group.GeneralLinearGroup;
import irvine.math.polynomial.CycleIndex;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001038 Invertible Boolean functions with GL(n,2) acting on the domain and range.
 * @author Sean A. Irvine
 */
public class A001038 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    final int n = ++mN;
    final CycleIndex domain = new GeneralLinearGroup<>(n, new GaloisField(2)).cycleIndex();
    return domain.invertible(domain);
  }
}
