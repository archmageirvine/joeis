package irvine.oeis.a005;

import irvine.math.q.Q;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A005221 Number of Dyck paths of knight moves.
 * @author Sean A. Irvine
 */
public class A005221 extends Sequence0 {

  // After Vladimir Kruchinin

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Q sum = Q.ZERO;
    for (long m = 2; m <= mN; ++m) {
      Q s = Q.ZERO;
      for (long i = 0; i <= mN - m; ++i) {
        Z t = Z.ZERO;
        for (long j = 0; j <= i + m; ++j) {
          t = t.add(Binomial.binomial(i + m, j).multiply(Binomial.binomial(j, i - j)));
        }
        Q u = Q.ZERO;
        for (long k = 0; k <= mN - i - m; ++k) {
          Z v = Z.ZERO;
          for (long l = 0; l <= k; ++l) {
            v = v.signedAdd(((mN - l - k - m) & 1) == 0, Binomial.binomial(k, l).multiply(Binomial.binomial(k - l, mN - 3 * l - k - i - m)));
          }
          u = u.add(new Q(v, k + i + m).multiply(Binomial.binomial(2 * k + i + m - 1, k)));
        }
        s = s.add(u.multiply(t));
      }
      sum = sum.add(s.multiply(m));
    }
    return sum.toZ();
  }
}
