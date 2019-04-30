package irvine.oeis.a001;

import irvine.math.group.AffineGroupCycleIndex;
import irvine.math.polynomial.CycleIndex;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A001537 Invertible Boolean functions with <code>AG(n,2)</code> acting on the domain and range.
 * @author Sean A. Irvine
 */
public class A001537 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    final CycleIndex domain = AffineGroupCycleIndex.cycleIndex(++mN);
    return domain.invertible(domain);
  }
}
