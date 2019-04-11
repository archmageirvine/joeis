package irvine.oeis.a005;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A005253 Number of binary words not containing <code>..01110..</code>.
 * @author Sean A. Irvine
 */
public class A005253 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 0; k <= mN / 5; ++k) {
      sum = sum.add(Binomial.binomial(mN - 3 * k, 2 * k));
    }
    return sum;
  }
}

