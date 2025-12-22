package irvine.oeis.a082;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A082760 Trinomial transform of central binomial coefficients (A000984).
 * @author Sean A. Irvine
 */
public class A082760 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long j = 0; j <= mN; ++j) {
      final Z b = Binomial.binomial(mN, j);
      for (long k = 0; k <= j; ++k) {
        sum = sum.add(b.multiply(Binomial.binomial(j, k)).multiply(Binomial.binomial(2 * (j + k), j + k)));
      }
    }
    return sum;
  }
}
