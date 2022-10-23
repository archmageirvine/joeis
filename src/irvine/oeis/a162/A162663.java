package irvine.oeis.a162;

import java.util.HashMap;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.Point;

/**
 * A162663 Table by antidiagonals, T(n,k) is the number of partitions of {1..(nk)} that are invariant under a permutation consisting of n k-cycles.
 * @author Sean A. Irvine
 */
public class A162663 extends Sequence0 {

  private final HashMap<Point, Z> mU = new HashMap<>();

  protected Z u(final int k, final int j) {
    if (k == 0) {
      return Z.ONE;
    }
    final Point key = new Point(k, j);
    final Z r = mU.get(key);
    if (r != null) {
      return r;
    }
    Z s = Z.ZERO;
    for (int i = 1; i <= k; ++i) {
      final Z u = u(k - i, j);
      Z t = Z.ZERO;
      for (int d = 1; d <= j; ++d) {
        if (j % d == 0) {
          t = t.add(u.multiply(Z.valueOf(d).pow(i - 1)));
        }
      }
      final Z v = t.multiply(Binomial.binomial(k - 1, i - 1));
      s = s.add(v);
    }
    mU.put(key, s);
    return s;
  }

  private int mN = 0;
  private int mK = 0;

  @Override
  public Z next() {
    if (--mK <= 0) {
      mK = ++mN;
    }
    return u(mN - mK, mK);
  }
}
