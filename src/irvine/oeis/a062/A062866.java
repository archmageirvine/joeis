package irvine.oeis.a062;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.Pair;

/**
 * A062866 Triangle of number of permutations by barycenter.
 * @author Sean A. Irvine
 */
public class A062866 extends Sequence0 {

  private final HashMap<Pair<Set<Integer>, Integer>, Map<Integer, Z>> mCache = new HashMap<>();
  protected Map<Integer, Z> mRow = Collections.emptyMap();
  protected int mMax = 0;
  private int mN = -1;
  private int mM = 0;

  private Map<Integer, Z> get(final Set<Integer> s, final Integer t) {
    final Pair<Set<Integer>, Integer> key = new Pair<>(s, t);
    final Map<Integer, Z> res = mCache.get(key);
    if (res != null) {
      return res;
    }
    final Map<Integer, Z> r = compute(s, t);
    mCache.put(key, r);
    return r;
  }

  private Map<Integer, Z> compute(final Set<Integer> s, final Integer t) {
    final int n = s.size();
    if (n == 0) {
      return Collections.singletonMap(t, Z.ONE);
    } else {
      Map<Integer, Z> res = Collections.emptyMap();
      for (final int j : s) {
        final HashSet<Integer> ss = new HashSet<>(s);
        ss.remove(j);
        res = add(res, get(ss, t + Integer.signum(n - j)));
      }
      return res;
    }
  }

  private Map<Integer, Z> add(final Map<Integer, Z> a, final Map<Integer, Z> b) {
    final HashMap<Integer, Z> r = new HashMap<>(a);
    for (final Map.Entry<Integer, Z> e : b.entrySet()) {
      r.merge(e.getKey(), e.getValue(), Z::add);
    }
    return r;
  }

  protected void step() {
    ++mN;
    final Set<Integer> s = new HashSet<>();
    for (int k = 1; k <= mN; ++k) {
      s.add(k);
    }
    mRow = get(s, 0);
    mMax = 0;
    for (final int k : mRow.keySet()) {
      if (k > mMax) {
        mMax = k;
      }
    }
  }

  @Override
  public Z next() {
    if (++mM > mMax) {
      step();
      mM = -mMax;
    }
    return mRow.get(mM);
  }
}
