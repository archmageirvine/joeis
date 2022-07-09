package irvine.oeis.a051;

import java.util.HashMap;
import java.util.TreeSet;

import irvine.math.MemoryFunction;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.Pair;

/**
 * A051014 Number of nondividing sets on {1,2,...,n}.
 * @author Sean A. Irvine
 */
public class A051014 implements Sequence {

  // After Alois P. Heinz

  private MemoryFunction<TreeSet<Integer>, TreeSet<Integer>> mS = new MemoryFunction<TreeSet<Integer>, TreeSet<Integer>>() {
    @Override
    protected TreeSet<Integer> compute(final TreeSet<Integer> set) {
      if (set.size() > 63) {
        throw new UnsupportedOperationException();
      }
      final Integer[] values = set.toArray(new Integer[0]);
      final TreeSet<Integer> res = new TreeSet<>();
      for (long k = 1; k < 1L << set.size(); ++k) {
        int sum = 0;
        int i = 0;
        for (long j = k; j != 0; j >>>= 1, ++i) {
          if ((j & 1) == 1) {
            sum += values[i];
          }
        }
        res.add(sum);
      }
      return res;
    }
  };

  private final HashMap<Pair<Integer, TreeSet<Integer>>, Long> mBCache = new HashMap<>();

  private long b(final int i, final TreeSet<Integer> s) {
    if (i < 2) {
      return 1;
    }
    final Pair<Integer, TreeSet<Integer>> key = new Pair<>(i, s);
    final Long v = mBCache.get(key);
    if (v != null) {
      return v;
    }
    final TreeSet<Integer> si = new TreeSet<>(s);
    si.add(i);
    boolean ok = true;
    outer:
    for (final int j : mS.getValue(si)) {
      for (final int t : si) {
        if (j != t && j % t == 0) {
          ok = false;
          break outer;
        }
      }
    }
    final long res = b(i - 1, s) + (ok ? b(i - 1, si) : 0);
    mBCache.put(key, res);
    return res;
  }

  private int mN = -1;

  @Override
  public Z next() {
    return ++mN == 0 ? Z.ONE : Z.valueOf(1 + b(mN, new TreeSet<>()));
  }
}
