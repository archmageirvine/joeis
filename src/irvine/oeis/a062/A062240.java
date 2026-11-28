package irvine.oeis.a062;

import irvine.math.group.BinarySubgroupCounts;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A062240 Number of subgroups of GL(n,2).
 * @author Gregory Morse
 */
public class A062240 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    return Z.valueOf(BinarySubgroupCounts.count(++mN, false));
  }
}
