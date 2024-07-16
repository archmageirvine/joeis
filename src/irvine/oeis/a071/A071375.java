package irvine.oeis.a071;

import java.util.HashSet;
import java.util.TreeMap;

import irvine.math.z.Z;
import irvine.oeis.a048.A048250;

/**
 * A071375 Smallest m such that sum of squarefree divisors of m equals n; a(n) = 0 if no solution to A048250(x) = n exists.
 * @author Sean A. Irvine
 */
public class A071375 extends A048250 {

  private static final int HEURISTIC = 10000;
  private final TreeMap<Z, Long> mFirsts = new TreeMap<>();
  private final HashSet<Z> mZeros = new HashSet<>();
  private long mM = 0;
  private Z mN = Z.ZERO;

  @Override
  public Z next() {
    mN = mN.add(1);
    while (mFirsts.size() < HEURISTIC) {
      ++mM;
      final Z t = super.next();
      if (t.compareTo(mN) >= 0) {
        mFirsts.putIfAbsent(t, mM);
      } else if (mZeros.contains(t)) {
        throw new RuntimeException("Heuristic failed, previously reported " + t + " as 0 should be " + mM);
      }
    }
    final Long v = mFirsts.remove(mN);
    if (v == null) {
      mZeros.add(mN);
      return Z.ZERO;
    }
    return Z.valueOf(v);
  }
}
