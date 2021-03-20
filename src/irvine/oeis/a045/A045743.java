package irvine.oeis.a045;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A045743 Number of noncrossing connected graphs on n nodes on a circle having no triangular faces.
 * @author Sean A. Irvine
 */
public class A045743 implements Sequence {

  private long mN = 1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 0; k <= (mN - 2) / 2; ++k) {
      sum = sum.add(Binomial.binomial(mN - 2 + k, k).multiply(Binomial.binomial(3 * mN - 3 - k, mN - 2 - 2 * k)).divide(mN - 1));
    }
    return sum;
  }
}
