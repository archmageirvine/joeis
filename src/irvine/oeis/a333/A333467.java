package irvine.oeis.a333;

import java.util.Arrays;
import java.util.HashMap;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A333467 Array read by antidiagonals: T(n,k) is the number of k-regular multigraphs on n labeled nodes, loops allowed, n &gt;= 0, k &gt;= 0.
 * @author Sean A. Irvine
 */
public class A333467 implements Sequence {

  // After Alois P. Heinz

  private final HashMap<String, Z> mCache = new HashMap<>();
  private int mN = -1;
  private int mM = 0;

  private Z computeB(final long[] l, final int i) {
    final int n = l.length;
    if (l[n - 1] == 0) {
      final long[] lp = Arrays.copyOf(l, n - 1);
      Arrays.sort(lp);
      return b(lp, n - 1);
    } else if (i < 1) {
      return Z.ZERO;
    } else {
      Z r = b(l, i - 1);
      if (i == n) {
        if (l[n - 1] > 1) {
          l[n - 1] -= 2;
          r = r.add(b(l, i));
          l[n - 1] += 2;
        }
      } else if (l[i - 1] > 0) {
        --l[n - 1];
        --l[i - 1];
        r = r.add(b(l, i));
        ++l[n - 1];
        ++l[i - 1];
      }
      return r;
    }
  }

  private Z b(final long[] l, final int i) {
    if (l.length == 0) {
      return Z.ONE;
    }
    final String key = Arrays.toString(l) + i;
    final Z res = mCache.get(key);
    if (res != null) {
      return res;
    }
    final Z r = computeB(l, i);
    mCache.put(key, r);
    return r;
  }

  protected Z t(final int n, final int k) {
    final long[] l = new long[n];
    Arrays.fill(l, k);
    return b(l, n);
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return t(mM, mN - mM);
  }
}
