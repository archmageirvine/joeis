package irvine.oeis.a055;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A055203 Number of different relations between n intervals on a line.
 * @author Sean A. Irvine
 */
public class A055203 extends Sequence0 {

  protected long mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    Z sum = Z.ZERO;
    for (long k = 2; k <= 2 * mN; ++k) {
      for (long i = 0; i <= k; ++i) {
        sum = sum.signedAdd(((k - i) & 1) == 0, Binomial.binomial(k, i).multiply(Z.valueOf(i * (i - 1) / 2).pow(mN)));
      }
    }
    return sum;
  }
}
