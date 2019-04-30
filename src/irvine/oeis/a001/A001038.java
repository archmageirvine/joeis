package irvine.oeis.a001;

import irvine.math.polynomial.CycleIndex;
import irvine.math.group.GeneralLinearCycleIndex;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001038 Invertible Boolean functions with <code>GL(n,2)</code> acting on the domain and range.
 * @author Sean A. Irvine
 */
public class A001038 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    final CycleIndex domain = GeneralLinearCycleIndex.cycleIndex(++mN);
    return domain.invertible(domain);
  }
}
