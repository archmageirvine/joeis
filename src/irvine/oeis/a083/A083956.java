package irvine.oeis.a083;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A083956 a(n) = sum of all cyclic permutation of concatenation of first n numbers. In each case the digits of a number are kept together for n&gt;9.
 * @author Sean A. Irvine
 */
public class A083956 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 1; k <= mN; ++k) {
      final StringBuilder sb = new StringBuilder();
      for (long j = 1; j <= mN; ++j) {
        sb.append((j + k) % mN + 1);
      }
      sum = sum.add(new Z(sb));
    }
    return sum;
  }
}
