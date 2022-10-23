package irvine.oeis.a003;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A003440 Number of binary vectors with restricted repetitions.
 * @author Sean A. Irvine
 */
public class A003440 extends Sequence0 {

  private long mN = -1;

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    Z s = Z.ZERO;
    for (long k = 0; k <= mN; ++k) {
      s = s.add(Binomial.binomial(k, mN - k).add(Binomial.binomial(k + 1, mN - k - 1)).square());
    }
    return s.divide2();
  }

}

