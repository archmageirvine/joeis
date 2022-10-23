package irvine.oeis.a053;

import irvine.factor.factor.Jaguar;
import irvine.math.Mobius;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A053548 Number of ternary Lyndon words of length n with trace 0 and subtrace 0 over GF(3).
 * @author Sean A. Irvine
 */
public class A053548 extends Sequence1 {

  private int mN = 0;

  protected Z m(final int n, final int t, final int s) {
    Z sum = Z.ZERO;
    for (int k = s; k <= n; k += 3) {
      for (int j = t; j + k <= n; j += 3) {
        final int i = n - j - k;
        sum = sum.add(Binomial.multinomial(n, i, j, k));
      }
    }
    return sum;
  }

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (final Z dd : Jaguar.factor(mN).divisors()) {
      final int d = dd.intValue();
      if (d % 3 != 0) {
        final int mu = Mobius.mobius(d);
        if (mu != 0) {
          Z m = m(mN / d, 0, 0);
          if (mN % (3L * d) == 0) {
            m = m.subtract(Z.THREE.pow(mN / (3L * d)));
          }
          sum = sum.signedAdd(mu == 1, m);
        }
      }
    }
    return sum.divide(mN);
  }
}
