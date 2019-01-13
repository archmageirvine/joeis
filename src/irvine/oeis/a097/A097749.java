package irvine.oeis.a097;

import irvine.math.z.Z;
import irvine.math.factorial.MemoryFactorial;
import irvine.util.Point;

import java.util.HashMap;

/**
 * A097749.
 * @author Sean A. Irvine
 */
public class A097749 extends A097474 {

  private int mN = -1;
  private int mK = 0;

  private final HashMap<Point, Z> mB = new HashMap<>();
  private final MemoryFactorial mF = new MemoryFactorial();

  private Z b(final int n, final int k) {
    final int h = (k + 3) / 2;
    if (n == k) {
      return mF.factorial(2 * n + 1).divide(mF.factorial(n)).shiftLeft(h - n).divide(t(k, k));
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
