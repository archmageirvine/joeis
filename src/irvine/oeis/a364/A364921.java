package irvine.oeis.a364;

import irvine.math.group.Gl2SubgroupCensus;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A364921 Number of conjugacy classes of subgroups of the group GL(2, Z_n) of invertible 2 X 2 matrices mod n.
 * @author Gregory Morse
 */
public class A364921 extends Sequence1 {

  private final Gl2SubgroupCensus mGroups = new Gl2SubgroupCensus();
  private int mN = 0;

  @Override
  public Z next() {
    return mGroups.count(++mN, true);
  }
}
