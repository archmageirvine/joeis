package irvine.oeis.a097;

import java.util.HashMap;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.Point;

/**
 * A097474 Triangle T(n,k) read by rows: see formula lines for definition.
 * @author Sean A. Irvine
 */
public class A097474 extends Sequence0 {

  private int mN = -1;
  private int mK = 0;

  private final HashMap<Point, Z> mT = new HashMap<>();

  protected Z t(final int n, final int k) {
    final int h = (n + 1) / 2;
    if (n == k) {
      return Z.valueOf(2 * n + 1).shiftLeft(h);
    }
    final Point key = new Point(n, k);
    final Z v = mT.get(key);
    if (v != null) {
      return v;
    }
    Z s = Z.ZERO;
    for (int j = k; j < n; ++j) {
      s = s.add(Binomial.binomial(2 * n + 1, 2 * j + 1).shiftLeft(h - (j + 3) / 2).multiply(t(j, k)));
    }
    s = Binomial.binomial(2L * n + 1, 2L * k).shiftLeft(h).subtract(s);
    mT.put(key, s);
    return s;
  }

  @Override
  public Z next() {
    if (++mK > mN) {
      ++mN;
      mK = 0;
    }
    return t(mN, mK);
  }
}
