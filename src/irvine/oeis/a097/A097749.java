package irvine.oeis.a097;

import java.util.HashMap;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.util.Point;

/**
 * A097749 Triangle T(n,k), n &gt;= 0, 0 &lt;= k &lt;= n, read by rows. Let A(n,k) be the triangle in A097474. Then T(n,k) is defined by the orthogonality relations Sum_{j=i..r} T(r,j)*A(j,i)*2^-floor((j+3)/2) = 0 if i != r, = (2r+1)!/(r!*2^r) if i = r.
 * @author Sean A. Irvine
 */
public class A097749 extends A097474 {

  private int mN = -1;
  private int mK = 0;

  private final HashMap<Point, Z> mB = new HashMap<>();

  private Z b(final int n, final int k) {
    final int h = (k + 3) / 2;
    if (n == k) {
      return Functions.FACTORIAL.z(2 * n + 1).divide(Functions.FACTORIAL.z(n)).shiftLeft(h - n).divide(t(k, k));
    }
    final Point key = new Point(n, k);
    final Z v = mB.get(key);
    if (v != null) {
      return v;
    }
    Z s = Z.ZERO;
    for (int j = k + 1; j <= n; ++j) {
      s = s.subtract(b(n, j).multiply(t(j, k)).shiftLeft(h - (j + 3) / 2));
    }
    s = s.divide(t(k, k));
    mB.put(key, s);
    return s;
  }

  @Override
  public Z next() {
    if (++mK > mN) {
      ++mN;
      mK = 0;
    }
    return b(mN, mK);
  }
}
