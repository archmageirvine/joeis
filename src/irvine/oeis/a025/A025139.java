package irvine.oeis.a025;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A025139 4th elementary symmetric function of C(n, 0), C(n, 1), ..., C(n,[ n/2 ]).
 * @author Sean A. Irvine
 */
public class A025139 extends AbstractSequence {

  /** Construct the sequence. */
  public A025139() {
    super(6);
  }

  private long mN = 5;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long a = 0; a < mN / 2; ++a) {
      final Z s = Binomial.binomial(mN, a);
      for (long b = a + 1; b < mN / 2; ++b) {
        final Z t = s.multiply(Binomial.binomial(mN, b));
        for (long c = b + 1; c < mN / 2; ++c) {
          final Z u = t.multiply(Binomial.binomial(mN, c));
          for (long d = c + 1; d <= mN / 2; ++d) {
            sum = sum.add(u.multiply(Binomial.binomial(mN, d)));
          }
        }
      }
    }
    return sum;
  }
}
