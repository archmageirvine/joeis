package irvine.oeis.a389;

import java.util.HashSet;
import java.util.Set;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A389370 a(n) is the length of the longest path in the rooted tree T_n defined in A390207 and in the comments.
 * @author Sean A. Irvine
 */
public class A389370 extends Sequence1 {

  private long mMax = 0;
  private long mN = 0;

  private void search(final long n, final Set<Long> used, final int height, final long sign) {
    if (height > mMax) {
      mMax = height;
    }
    for (final Z pp : Jaguar.factor(n).toZArray()) {
      final long d = n / pp.longValue();
      final long m = n + sign * d;
      if (used.add(m)) {
        search(m, used, height + 1, -sign);
        used.remove(m);
      }
    }
  }

  @Override
  public Z next() {
    mMax = 0;
    final HashSet<Long> used = new HashSet<>();
    used.add(++mN);
    search(mN, used, 0, 1);
    return Z.valueOf(mMax);
  }
}
