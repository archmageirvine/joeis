package irvine.oeis.a031;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A031971 a(n) = Sum_{k=1..n} k^n.
 * @author Sean A. Irvine
 */
public class A031971 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int k = 1; k <= mN; ++k) {
      sum = sum.add(Z.valueOf(k).pow(mN));
    }
    return sum;
  }
}
