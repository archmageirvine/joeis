package irvine.oeis.a003;

import java.util.ArrayList;
import java.util.HashMap;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.Point;

/**
 * A003030 Number of strongly connected digraphs with n labeled nodes.
 * @author Sean A. Irvine
 */
public class A003030 implements Sequence {

  private int mN = 0;
  private final HashMap<Point, Z> mLambda = new HashMap<>();

  protected Z lambda(final int m, final int n) {
    if (n == 0) {
      return Z.ONE;
    }
    final Point key = new Point(m, n);
    final Z res = mLambda.get(key);
    if (res != null) {
      return res;
    }
    Z s = Z.ONE.shiftLeft(n * (n + m - 1));
    for (int k = 0; k < n; ++k) {
      s = s.subtract(Binomial.binomial(n, k).multiply(lambda(m, k)).shiftLeft((n - k) * (n - 1)));
    }
    mLambda.put(key, s);
    return s;
  }

  private Z iota(final int n) {
    return lambda(1, n - 1).shiftLeft(n - 1);
  }

  private final ArrayList<Z> mS = new ArrayList<>();
  {
    mS.add(null);
    mS.add(Z.ONE);
  }

  protected Z s(final int n) {
    while (n >= mS.size()) {
      final int m = mS.size();
      Z s = iota(m);
      for (int j = 1; j < m; ++j) {
        s = s.subtract(Binomial.binomial(m - 1, j - 1).multiply(lambda(j, m - j)).multiply(mS.get(j)));
      }
      mS.add(s);
    }
    return mS.get(n);
  }

  @Override
  public Z next() {
    return s(++mN);
  }
}
