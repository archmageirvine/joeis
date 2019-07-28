package irvine.oeis.a024;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A024917 <code>Sum(k*floor(n/k), k=2..n)</code>.
 * @author Sean A. Irvine
 */
public class A024917 implements Sequence {

  private long mN = 1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 2; k <= mN; ++k) {
      sum = sum.add(Z.valueOf(k).multiply(mN / k));
    }
    return sum;
  }
}
