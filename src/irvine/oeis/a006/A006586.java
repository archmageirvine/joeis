package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A006586 a(n) = Sum_{k=1..n} floor((2n-1)/(2k+1)).
 * @author Sean A. Irvine
 */
public class A006586 extends Sequence2 {

  private long mN = 1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    final long m = 2 * mN - 1;
    for (int k = 1; k <= mN; ++k) {
      sum = sum.add(m / (2L * k + 1));
    }
    return sum;
  }
}
