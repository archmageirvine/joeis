package irvine.oeis.a067;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A067459 Sum of the remainders when n^2 is divided by squares less than n.
 * @author Sean A. Irvine
 */
public class A067459 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final long sq = ++mN * mN;
    Z sum = Z.ZERO;
    for (long k = 2; k < mN; ++k) {
      sum = sum.add(sq % (k * k));
    }
    return sum;
  }
}

