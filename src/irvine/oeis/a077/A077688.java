package irvine.oeis.a077;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A077688 a(n) = sum of all cyclic permuted concatenations of the next n numbers.
 * @author Sean A. Irvine
 */
public class A077688 extends Sequence1 {

  private long mN = 0;
  private long mM = 1;

  @Override
  public Z next() {
    mM += mN;
    ++mN;
    Z sum = Z.ZERO;
    for (long k = 0; k < mN; ++k) {
      final StringBuilder sb = new StringBuilder();
      for (long i = 0; i < mN; ++i) {
        sb.append((k + i) % mN + mM);
      }
      sum = sum.add(new Z(sb));
    }
    return sum;
  }
}
