package irvine.oeis.a390;

import java.util.HashSet;
import java.util.Set;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A390207 allocated for Miles Englezou.
 * @author Sean A. Irvine
 */
public class A390207 extends Sequence1 {

  private long mCount = 0;
  private long mN = 0;

  private void search(final long n, final Set<Long> used, final int height, final long sign) {
    boolean terminates = true;
    for (final Z pp : Jaguar.factor(n).toZArray()) {
      final long d = n / pp.longValue();
      final long m = n + sign * d;
      if (used.add(m)) {
        terminates = false;
        search(m, used, height + 1, -sign);
        used.remove(m);
      }
    }
    if (terminates) {
      ++mCount;
    }
  }

  @Override
  public Z next() {
    mCount = 0;
    final HashSet<Long> used = new HashSet<>();
    used.add(++mN);
    search(mN, used, 0, 1);
    return Z.valueOf(mCount);
  }
}
