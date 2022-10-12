package irvine.oeis.a059;

import irvine.math.api.Group;
import irvine.math.group.GroupFactory;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A059807 Maximal size of the commutator subgroup of G where G is a finite group of order n.
 * @author Sean A. Irvine
 */
public class A059807 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    Z max = Z.ONE;
    for (final Group<?> g : GroupFactory.smallGroups(++mN)) {
      final Z size = g.derivedSubgroup().size();
      if (size.compareTo(max) > 0) {
        max = size;
      }
    }
    return max;
  }
}
