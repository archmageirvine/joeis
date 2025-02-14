package irvine.oeis.a075;

import java.util.HashSet;
import java.util.Set;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A070428.
 * @author Sean A. Irvine
 */
public class A075315 extends A000040 {

  private final Set<Z> mSeen = new HashSet<>();
  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    final Z p = super.next();
    while (true) {
      mN = mN.add(1);
      if (mSeen.add(mN)) {
        final Z q = mN.add(p);
        mSeen.add(q);
        return q.add(mN);
      }
    }
  }
}
