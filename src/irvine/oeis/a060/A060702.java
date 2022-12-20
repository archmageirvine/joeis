package irvine.oeis.a060;

import irvine.math.api.Group;
import irvine.math.group.GroupFactory;
import irvine.math.z.Z;
import irvine.oeis.a056.A056868;

/**
 * A060702 Orders of finite groups that have trivial center.
 * @author Sean A. Irvine
 */
public class A060702 extends A056868 {

  private boolean mFirst = true;

  @Override
  public Z next() {
    if (mFirst) {
      mFirst = false;
      return Z.ONE;
    }
    while (true) {
      final Z n = super.next();
      for (final Group<?> g : GroupFactory.smallGroups(n.intValueExact())) {
        final Z sizeCenter = g.center().size();
        if (sizeCenter.equals(Z.ONE)) {
          return n;
        }
      }
    }
  }
}
