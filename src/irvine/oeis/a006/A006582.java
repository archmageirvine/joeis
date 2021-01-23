package irvine.oeis.a006;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A006582 a(n) = Sum_{k=1..n-1} k XOR n-k.
 * @author Sean A. Irvine
 */
public class A006582 implements Sequence {

  private long mN = 1;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int k = 1; k < mN; ++k) {
      sum = sum.add((mN - k) ^ k);
    }
    return sum;
  }
}
