package irvine.oeis.a000;

import irvine.math.polynomial.CycleIndex;
import irvine.math.group.GeneralLinearCycleIndex;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A000585 Number of equivalence classes of Boolean functions of n variables under GL(n,2).
 * @author Sean A. Irvine
 */
public class A000585 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    final CycleIndex ci = GeneralLinearCycleIndex.cycleIndex(++mN);
    return ci.apply(1).toZ();
  }

}
