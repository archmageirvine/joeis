package irvine.oeis.a082;

import irvine.math.function.Functions;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A082765 Trinomial transform of the factorial numbers (A000142).
 * @author Sean A. Irvine
 */
public class A082765 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long j = 0; j <= mN; ++j) {
      final Z b = Binomial.binomial(mN, j);
      for (long k = 0; k <= j; ++k) {
        sum = sum.add(b.multiply(Binomial.binomial(j, k)).multiply(Functions.FACTORIAL.z(2 * j - k)));
      }
    }
    return sum;
  }
}
