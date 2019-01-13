package irvine.oeis.a005;

import irvine.math.q.Q;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005220.
 * @author Sean A. Irvine
 */
public class A005220 implements Sequence {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Q sum = Q.ZERO;
    for (long m = 0; m <= mN; ++m) {
      Z s = Z.ZERO;
      for (long j = (m + 1) / 2; j <= m; ++j) {
        s = s.add(Binomial.binomial(j, m - j).multiply(Binomial.binomial(m + 1, j)));
      }
      Q t = Q.ZERO;
      for (long k = 0; k <= mN - m; ++k) {
        Z u = Z.ZERO;
        for (long l = 0; l <= k; ++l) {
          u = u.signedAdd(((mN - l - k) & 1) == 0, Binomial.binomial(k, l).multiply(Binomial.binomial(k - l, mN - m - 3 * l - k)));
        }
        t = t.add(new Q(u, Z.valueOf(m + k + 1)).multiply(Binomial.binomial(m + 2 * k, k)));
      }
      sum = sum.add(t.multiply(s));
    }
    return sum.toZ();
  }
}
