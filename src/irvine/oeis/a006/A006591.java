package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006591 a(n) = Sum_{k=1..n} nearest integer to n/k (if n/k is midway between two numbers take the smaller).
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
