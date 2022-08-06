package irvine.oeis.a058;

import irvine.math.z.Z;
import irvine.oeis.a026.A026820;

/**
 * A058401 Triangle of partial row sums of partition triangle A026820.
 * @author Sean A. Irvine
 */
public class A058401 extends A026820 {

  private long mN = 0;
  private long mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 1;
    }
    Z sum = Z.ZERO;
    for (long k = mM; k <= mN; ++k) {
      sum = sum.add(get(mN, k));
    }
    return sum;
  }
}
