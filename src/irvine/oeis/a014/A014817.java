package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A014817.
 * @author Sean A. Irvine
 */
public class A014817 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 1; k <= mN; ++k) {
      sum = sum.add(Z.valueOf(k).square().divide(mN));
    }
    return sum;
  }
}
