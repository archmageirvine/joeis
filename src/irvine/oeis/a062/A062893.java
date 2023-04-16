package irvine.oeis.a062;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence0;
import irvine.util.Permutation;

/**
 * A062893 Number of squares that can be obtained by using some or all of the digits of n.
 * @author Sean A. Irvine
 */
public class A062893 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    final Permutation perm = Permutation.permuter(Z.valueOf(++mN));
    int[] p;
    final HashSet<Z> seen = new HashSet<>();
    if (ZUtils.digitCounts(mN)[0] > 0) {
      seen.add(Z.ZERO);
    }
    while ((p = perm.next()) != null) {
      Z t = Permutation.permToZ(p);
      do {
        if (t.isSquare()) {
          seen.add(t);
        }
        t = t.divide(10);
      } while (!t.isZero());
    }
    return Z.valueOf(seen.size());
  }
}

