package irvine.oeis.a060;

import irvine.math.IntegerUtils;
import irvine.math.api.Group;
import irvine.math.group.GroupFactory;
import irvine.math.z.Z;
import irvine.util.string.StringUtils;

/**
 * A060021 Maximal size of a subset of any Abelian group of order n that does not contain 0 and fails to span the group nontrivially.
 * @author Sean A. Irvine
 */
public class A060021 extends A060020 {

  @Override
  public Z next() {
    ++mN;
    if (mN >= 10 && (mN & 1) == 0) {
      return Z.valueOf(mN / 2 - 1); // Theorem Griggs
    }
    if (mN > 2 && mPrime.isPrime(mN)) {
      return Z.valueOf(IntegerUtils.sqrt(4 * mN - 8) - 1); // Theorem Griggs
    }
    // There are other applicable Theorems that could handle many other cases,
    // but here we use an explicit construction of the relevant spanning sets.
    long max = 0;
    for (final Group<?> g : GroupFactory.smallGroups(mN)) {
      if (g.isAbelian()) {
        final long m = maxSpanningSize(g, 0, 0);
        if (mVerbose) {
          StringUtils.message(g + " with size " + g.size() + " has max " + m);
        }
        if (m > max) {
          max = m;
        }
      }
    }
    return Z.valueOf(max);
  }
}
