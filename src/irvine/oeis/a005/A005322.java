package irvine.oeis.a005;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005322 Column of Motzkin triangle.
 * @author Sean A. Irvine
 */
public class A005322 implements Sequence {

  private long mN = 1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 1; k <= mN + 2; ++k) {
      Z s = Z.ZERO;
      for (long j = k; j <= mN + 2; ++j) {
        s = s.signedAdd(((mN + 2 - j) & 1) == 0, Binomial.binomial(2 * j - k - 1, j - 1).multiply(Binomial.binomial(mN + 2, j)));
      }
      sum = sum.add(s.multiply(k).multiply(k - 2));
    }
    return sum.divide(mN + 2);
  }
}

