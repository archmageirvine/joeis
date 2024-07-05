package irvine.oeis.a071;

import java.util.HashMap;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A071201 Array A(n,k) read by antidiagonals giving number of paths up and right from (0,0) to (n,k) where x/y&lt;=n/k.
 * @author Sean A. Irvine
 */
public class A071201 extends Sequence1 {

  // After Alois P. Heinz

  private int mN = 0;
  private int mM = 0;
  private final HashMap<String, Z> mCache = new HashMap<>();

  private Z b(final int x, final int y, final Q r) {
    if (y < 0 || new Q(y).compareTo(r.multiply(x)) > 0) {
      return Z.ZERO;
    }
    if (x == 0) {
      return Z.ONE;
    }
    final String key = x + "," + y + "," + r;
    final Z res = mCache.get(key);
    if (res != null) {
      return res;
    }
    final Z t = b(x - 1, y, r).add(b(x, y - 1, r));
    mCache.put(key, t);
    return t;
  }

  private Z a(final int n, final int k) {
    return k < n ? b(k, n, new Q(n, k)) : b(n, k, new Q(k, n));
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    return a(mM, mN + 1 - mM);
  }
}
