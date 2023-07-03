package irvine.oeis.a018;

import java.util.ArrayList;
import java.util.TreeSet;

import irvine.math.LongUtils;
import irvine.oeis.memory.MemoryFunction2Sequence;
import irvine.math.z.Z;

/**
 * A018219 Table T(a,b) by antidiagonals of winning positions in 3-pile Wythoff game (a square array).
 * @author Sean A. Irvine
 */
public class A018219 extends MemoryFunction2Sequence<Long, Long> {

  private long mN = -1;
  private long mM = 0;

  @Override
  protected Long compute(final Long a, final Long b) {
    if (a == 0 && b == 0) {
      return 0L;
    }
    if (a > b) {
      return get(b, a);
    }
    final TreeSet<Long> mex = new TreeSet<>();
    final ArrayList<Long> v = new ArrayList<>();
    for (int k = 1; k <= a; ++k) {
      v.add(get(a - k, b));
    }
    addAndClear(mex, v);
    for (int k = 1; k <= b; ++k) {
      v.add(get(a, b - k));
    }
    addAndClear(mex, v);
    for (int k = 1; k <= Math.min(a, b); ++k) {
      v.add(get(a - k, b - k));
    }
    addAndClear(mex, v);
    return LongUtils.mex(mex);
  }

  private void addAndClear(final TreeSet<Long> mex, final ArrayList<Long> v) {
    mex.addAll(v);
    int j = 0;
    for (final long u : v) {
      mex.add(u + ++j);
    }
    v.clear();
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return Z.valueOf(get(mM, mN - mM));
  }
}

