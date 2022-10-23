package irvine.oeis.a025;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence3;

/**
 * A025133 4th elementary symmetric function of C(n,0), C(n,1), ..., C(n,n).
 * @author Sean A. Irvine
 */
public class A025133 extends Sequence3 {

  private long mN = 2;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long a = 0; a < mN; ++a) {
      final Z s = Binomial.binomial(mN, a);
      for (long b = a + 1; b < mN; ++b) {
        final Z t = s.multiply(Binomial.binomial(mN, b));
        for (long c = b + 1; c < mN; ++c) {
          final Z u = t.multiply(Binomial.binomial(mN, c));
          for (long d = c + 1; d <= mN; ++d) {
            sum = sum.add(u.multiply(Binomial.binomial(mN, d)));
          }
        }
      }
    }
    return sum;
  }
}
