package irvine.oeis.a072;

import java.util.HashSet;
import java.util.Set;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A072207 a(0) = 1; for n&gt;0, a(n) = number of distinct sums of subsets of {1, 1/2, 1/3, 1/4, ..., 1/n} (allowing the empty subset).
 * @author Sean A. Irvine
 */
public class A072207 extends Sequence0 {

  private final HashSet<Q> mA = new HashSet<>();
  private long mN = 0;

  @Override
  public Z next() {
    if (mA.isEmpty()) {
      mA.add(Q.ZERO);
    } else {
      final Q t = new Q(1, ++mN);
      final Set<Q> next = new HashSet<>();
      for (final Q v : mA) {
        next.add(v.add(t));
      }
      mA.addAll(next);
    }
    return Z.valueOf(mA.size());
  }
}
