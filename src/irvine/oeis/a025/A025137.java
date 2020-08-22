package irvine.oeis.a025;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A025137 a(n) = 3rd elementary symmetric function of C(n,0), C(n,1), ..., C(n,[ n/2 ]).
 * @author Sean A. Irvine
 */
public class A025137 implements Sequence {

  private long mN = 3;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long a = 0; a < mN / 2; ++a) {
      final Z s = Binomial.binomial(mN, a);
      for (long b = a + 1; b < mN / 2; ++b) {
        final Z t = s.multiply(Binomial.binomial(mN, b));
        for (long c = b + 1; c <= mN / 2; ++c) {
          sum = sum.add(t.multiply(Binomial.binomial(mN, c)));
        }
      }
    }
    return sum;
  }
}
