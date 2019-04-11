package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006591 Sum_{k <code>= 1..n }</code> nearest integer to <code>n/k</code> (if <code>n/k</code> is midway between two numbers take the smaller).
 * @author Sean A. Irvine
 */
public class A006591 implements Sequence {

  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int k = 1; k <= mN; ++k) {
      sum = sum.add((mN + (k - 1) / 2) / k);
    }
    return sum;
  }
}
