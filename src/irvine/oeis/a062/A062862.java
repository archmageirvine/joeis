package irvine.oeis.a062;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.Pair;

/**
 * A062697.
 * @author Sean A. Irvine
 */
public class A062862 extends Sequence0 {

  private final HashMap<Long, Set<Pair<Long, Long>>> mA = new HashMap<>();
  private long mN = -1;
  private long mM = 0;
  private long mS = 0;

  private void augment(final long sum, final long lo, final long hi) {
    final Set<Pair<Long, Long>> lst = mA.get(sum);
    if (lst == null) {
      final Set<Pair<Long, Long>> l = new HashSet<>();
      l.add(new Pair<>(lo, hi));
      mA.put(sum, l);
    } else {
      lst.add(new Pair<>(lo, hi));
    }
  }

  @Override
  public Z next() {
    if (++mN == mS) {
      augment(mS, mM, mM);
      augment(mS, -mM, -mM);
      mS = ++mM * mM;
    }
    final Set<Pair<Long, Long>> lst = mA.remove(mN);
    if (lst == null) {
      return Z.ZERO;
    }
    for (final Pair<Long, Long> pair : lst) {
      final long l = pair.left();
      final long r = pair.right();
      augment(mN + (r + 1) * (r + 1), l, r + 1);
      augment(mN + (l - 1) * (l - 1), l - 1, r);
    }
    return Z.valueOf(lst.size());
  }
}
