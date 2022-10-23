package irvine.oeis.a034;

import irvine.math.api.Group;
import irvine.math.group.GroupFactory;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A034383 Number of labeled groups.
 * @author Sean A. Irvine
 */
public class A034383 extends Sequence1 {

  protected int mN = 0;
  private Z mF = Z.ONE;

  @Override
  public Z next() {
    mF = mF.multiply(++mN);
    Z sum = Z.ZERO;
    for (final Group<?> g : GroupFactory.smallGroups(mN)) {
      sum = sum.add(mF.divide(g.autOrder()));
    }
    return sum;
  }
}
