package irvine.oeis.a078;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A078632 Number of geometric subsequences of [1,...,n] with integral successive-term ratio and length &gt; 1.
 * @author Sean A. Irvine
 */
public class A078632 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long r = 2; r <= mN; ++r) {
      long k = r;
      while (k <= mN) {
        sum = sum.add(mN / k);
        k *= r;
      }
    }
    return sum;
  }
}
