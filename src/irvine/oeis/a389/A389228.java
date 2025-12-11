package irvine.oeis.a389;

import java.util.HashSet;
import java.util.Set;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A389228 allocated for Miles Englezou.
 * @author Sean A. Irvine
 */
public class A389228 extends Sequence1 {

  private long mMin = 0;
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
    if (terminates && height < mMin) {
      mMin = height;
    }
  }

  @Override
  public Z next() {
    mMin = Long.MAX_VALUE;
    final HashSet<Long> used = new HashSet<>();
    used.add(++mN);
    search(mN, used, 0, 1);
    return Z.valueOf(mMin);
  }
}
