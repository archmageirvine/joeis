package irvine.oeis.a046;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import irvine.math.MemoryFunction2;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A046663 Triangle: T(n,k) = number of partitions of n (&gt;=2) with no subsum equal to k (1 &lt;= k &lt;= n-1).
 * @author Sean A. Irvine
 */
public class A046663 extends MemoryFunction2<Integer, Z> implements Sequence {

  // After Alois P. Heinz

  private int mN = 1;
  private int mM = 1;
  private final HashMap<String, Z> mBCache = new HashMap<>();

  private Z b(final int n, final int i, final Set<Integer> s) {
    final String key = n + "," + i + "," + s;
    final Z res = mBCache.get(key);
    if (res != null) {
      return res;
    }

    if (s.contains(0) || s.contains(n)) {
      return Z.ZERO;
    }
    if (n == 0 || s.isEmpty()) {
      return get(n, i);
    }
    if (i < 1) {
      return Z.ZERO;
    }
    Z r = b(n, i - 1, s);
    if (i <= n) {
      final HashSet<Integer> h = new HashSet<>();
      for (final int v : s) {
        if (v <= n - i) {
          h.add(v);
        }
        if (v - i >= 0) {
          h.add(v - i);
        }
      }
      r = r.add(b(n - i, i, h));
    }

    mBCache.put(key, r);
    return r;
  }

  @Override
  protected Z compute(final Integer n, final Integer m) {
    if (n == 0) {
      return Z.ONE;
    }
    return (m > 1 ? get(n, m - 1) : Z.ZERO).add(m > n ? Z.ZERO : get(n - m, m));
  }

  @Override
  public Z next() {
    if (++mM >= mN) {
      ++mN;
      mM = 1;
    }
    return b(mN, mN, Collections.singleton(Math.min(mM, mN - mM)));
  }
}
