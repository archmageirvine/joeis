package irvine.oeis.a014;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A014819 a(n) = Sum_{k=1..n} floor(k^4/n).
 * @author Sean A. Irvine
 */
public class A014819 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 1; k <= mN; ++k) {
      sum = sum.add(Z.valueOf(k).pow(4).divide(mN));
    }
    return sum;
  }
}
