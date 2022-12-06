package irvine.oeis.a060;

import irvine.math.api.Group;
import irvine.math.group.GroupFactory;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A060653 Minimal number of conjugacy classes (which is also the number of irreducible representations) in G where G is a finite group of order n.
 * @author Sean A. Irvine
 */
public class A060653 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    long min = Long.MAX_VALUE;
    for (final Group<?> g : GroupFactory.smallGroups(mN)) {
      final long cc = g.numberConjugacyClasses().longValueExact();
      if (cc < min) {
        min = cc;
      }
    }
    return Z.valueOf(min);
  }
}
