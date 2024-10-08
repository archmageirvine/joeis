package irvine.oeis.a072;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A072516 Sum of remainders when n is divided by lesser squares.
 * @author Sean A. Irvine
 */
public class A072516 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 2; k * k < mN; ++k) {
      sum = sum.add(mN % (k * k));
    }
    return sum;
  }
}
