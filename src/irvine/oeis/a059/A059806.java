package irvine.oeis.a059;

import irvine.math.api.Group;
import irvine.math.group.GroupFactory;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A059806 Minimal size of the center of G where G is a finite group of order n.
 * @author Sean A. Irvine
 */
public class A059806 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    Z min = null;
    for (final Group<?> g : GroupFactory.smallGroups(++mN)) {
      final Z sizeCenter = g.center().size();
      if (sizeCenter.equals(Z.ONE)) {
        return Z.ONE;
      } else if (min == null) {
        min = sizeCenter;
      } else if (sizeCenter.compareTo(min) < 0) {
        min = sizeCenter;
      }
    }
    return min;
  }
}
