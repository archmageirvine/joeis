package irvine.oeis.a058;

import irvine.math.polynomial.CycleIndex;
import irvine.math.polynomial.PalmerSymPowerCycleIndex;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A058793 Number of covers of an unlabeled n-set such that every point of the set is covered by exactly 6 subsets of the cover and that intersection of every 6 subsets of the cover contains at most one point.
 * @author Sean A. Irvine
 */
public class A058793 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    final CycleIndex z = new PalmerSymPowerCycleIndex().cycleIndex(6, 6 * ++mN);
    return z.applyOnePlusXToTheN(mN).coeff(mN).toZ();
  }
}
