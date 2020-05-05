package irvine.oeis.a031;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A031971 <code>a(n) = Sum_{k=1..n} k^n</code>.
 * @author Sean A. Irvine
 */
public class A031971 implements Sequence {

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
