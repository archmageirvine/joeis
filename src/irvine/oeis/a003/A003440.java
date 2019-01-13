package irvine.oeis.a003;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A003440.
 * @author Sean A. Irvine
 */
public class A003440 implements Sequence {

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

