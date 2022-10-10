package irvine.oeis.a059;

import irvine.math.api.Group;
import irvine.math.group.GroupFactory;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A059773 Maximum size of Aut(G) where G is a finite group of order n.
 * @author Sean A. Irvine
 */
public class A059773 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    Z maxAut = Z.ZERO;
    for (final Group<?> g : GroupFactory.smallGroups(++mN)) {
      maxAut = maxAut.max(g.autOrder());
    }
    return maxAut;
  }
}
