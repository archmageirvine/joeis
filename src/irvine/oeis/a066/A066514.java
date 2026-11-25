package irvine.oeis.a066;

import irvine.math.group.Gl2SubgroupCensus;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A066514 Number of subgroups of the group GL(2,Z_n) of invertible 2 X 2 matrices mod n (sequence A000252).
 * @author Gregory Morse
 */
public class A066514 extends Sequence1 {

  private final Gl2SubgroupCensus mGroups = new Gl2SubgroupCensus();
  private int mN = 0;

  @Override
  public Z next() {
    return mGroups.count(++mN, false);
  }
}
