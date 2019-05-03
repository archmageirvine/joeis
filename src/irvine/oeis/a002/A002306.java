package irvine.oeis.a002;

import irvine.math.q.Q;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

import java.util.HashMap;

/**
 * A002306 Numerators of Hurwitz numbers <code>H_n (coefficients</code> in expansion of Weierstrass <code>P-function)</code>.
 * @author Sean A. Irvine
 */
public class A002306 implements Sequence {

  private static final Q H0 = new Q(1, 10);

  private final HashMap<Long, Q> mCache = new HashMap<>();
  private int mN = 0;

  protected Q hurwitz(final long n) {
    if (n == 1) {
      return H0;
    }
    final Q r = mCache.get(n);
    if (r != null) {
      return r;
    }
    Q s = Q.ZERO;
    for (long k = 1; k < n; ++k) {
      final Q c = hurwitz(n - k).multiply(hurwitz(k));
      final Q t = c.multiply(Binomial.binomial(4 * n, 4 * k)).multiply(4 * n - 4 * k - 1).multiply(4 * k - 1);
      s = s.add(t);
    }
    final Z d = Z.valueOf(n).square().shiftLeft(4).subtract(1).multiply(2 * n - 3);
    s = s.multiply(new Q(Z.THREE, d));
    mCache.put(n, s);
    return s;
  }

  @Override
  public Z next() {
    return hurwitz(++mN).num();
  }
}
