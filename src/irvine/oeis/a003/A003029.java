package irvine.oeis.a003;

import java.util.HashMap;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.util.Point;

/**
 * A003029 Number of unilaterally connected digraphs with n labeled nodes.
 * @author Sean A. Irvine
 */
public class A003029 extends A003030 {

  private int mN = 0;
  private final HashMap<Point, Z> mU = new HashMap<>();

  private Z u(final int n, final int k) {
    if (n == k) {
      return s(n);
    }
    final Point key = new Point(n, k);
    final Z res = mU.get(key);
    if (res != null) {
      return res;
    }
    Z s = Z.ZERO;
    for (int j = 1; j <= n - k; ++j) {
      s = s.add(u(n - k, j).multiply(Z.ONE.shiftLeft((long) k * j).subtract(1)).shiftLeft((long) k * (n - k - j)));
    }
    s = s.multiply(Binomial.binomial(n, k)).multiply(s(k));
    mU.put(key, s);
    return s;
  }

  @Override
  public Z next() {
    ++mN;
    Z s = Z.ZERO;
    for (int k = 1; k <= mN; ++k) {
      s = s.add(u(mN, k));
    }
    return s;
  }
}
