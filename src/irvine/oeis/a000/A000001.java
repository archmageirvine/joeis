package irvine.oeis.a000;

import irvine.math.group.GroupFactory;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A000001 Number of groups of order n.
 * @author Sean A. Irvine
 */
public class A000001 extends Sequence0 {

  private int mN = -1;

  @Override
  public Z next() {
    return Z.valueOf(GroupFactory.smallGroups(++mN).size());
  }
}
