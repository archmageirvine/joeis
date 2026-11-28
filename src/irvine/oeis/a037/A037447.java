package irvine.oeis.a037;

import irvine.math.group.BinarySubgroupCounts;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A037447 Number of conjugacy classes of subgroups of GL(n,2).
 * @author Gregory Morse
 */
public class A037447 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(BinarySubgroupCounts.count(++mN, true));
  }
}
