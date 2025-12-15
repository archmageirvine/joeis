package irvine.oeis.a390;

import java.util.HashSet;
import java.util.Set;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A390207 Let T_n be a rooted tree constructed in the following way. With k_0 = n as the root, let k_i be a vertex of depth i. For each prime divisor p of k_i, the children of k_i are those m = k_i + (-1)^i*k_i/p, where m &gt;= 1 and m does not appear in the path from k_0 to k_i. a(n) is the number of paths in T_n.
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
