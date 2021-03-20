package irvine.oeis.a045;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A045744 Number of noncrossing connected graphs on n nodes on a circle having no four-sided faces.
 * @author Sean A. Irvine
 */
public class A045744 implements Sequence {

  private long mN = 1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 0; k <= (mN - 2) / 3; ++k) {
      sum = sum.add(Binomial.binomial(mN - 2 + k, k).multiply(Binomial.binomial(4 * mN - 4 - k, mN - 2 - 3 * k)).divide(mN - 1));
    }
    return sum;
  }
}
