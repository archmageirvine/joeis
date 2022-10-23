package irvine.oeis.a025;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A025136 a(n) = 2nd elementary symmetric function of C(n,0), C(n,1), ..., C(n,[ n/2 ]).
 * @author Sean A. Irvine
 */
public class A025136 extends Sequence2 {

  private long mN = 1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long a = 0; a < mN / 2; ++a) {
      final Z s = Binomial.binomial(mN, a);
      for (long b = a + 1; b <= mN / 2; ++b) {
        sum = sum.add(s.multiply(Binomial.binomial(mN, b)));
      }
    }
    return sum;
  }
}
