package irvine.oeis.a079;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A079809 Consider a triangle in which the 2n-th row contains first 2n positive integers in increasing order and the (2n+1)-st row contains first 2n+1 positive integers in decreasing order; sequence contains concatenation of numbers read upward at a 45-degree angle.
 * @author Sean A. Irvine
 */
public class A079809 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    final StringBuilder sb = new StringBuilder();
    for (long k = 1; k <= (mN + 1) / 2; ++k) {
      sb.append(((mN + 1 - k) & 1) == 1 ? mN + 2 - 2 * k : k);
    }
    return new Z(sb);
  }
}

