package irvine.oeis.a053;

import irvine.math.group.AffineGroupCycleIndex;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A053037 Number of self-complementary types of Boolean functions of n variables under action of AG(n,2).
 * @author Sean A. Irvine
 */
public class A053037 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    return AffineGroupCycleIndex.cycleIndex(++mN).apply(0, 1).toZ();
  }
}
