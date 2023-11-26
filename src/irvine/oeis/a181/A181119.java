package irvine.oeis.a181;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A181119 Number of transpose-complementary plane partitions of n.
 * @author Sean A. Irvine
 */
public class A181119 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z num = Z.ONE;
    Z den = Z.ONE;
    for (long i = 1; i <= 2 * mN - 2; ++i) {
      for (long j = i; j <= 2 * mN - 2; ++j) {
        num = num.multiply(2 * mN + i + j + 1);
        den = den.multiply(i + j + 1);
      }
    }
    return num.multiply(Binomial.binomial(3 * mN - 1, mN)).divide(den);
  }
}

