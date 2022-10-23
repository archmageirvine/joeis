package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A014818 a(n) is the sum over all floor(k^3/n), k=0 to n inclusive.
 * @author Sean A. Irvine
 */
public class A014818 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 1; k <= mN; ++k) {
      sum = sum.add(Z.valueOf(k).pow(3).divide(mN));
    }
    return sum;
  }
}
