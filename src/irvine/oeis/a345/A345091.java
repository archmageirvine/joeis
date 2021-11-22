package irvine.oeis.a345;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A345091 a(n) = Sum_{k=1..n} k^floor(1/gcd(n,k)).
 * @author Georg Fischer
 */
public class A345091 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int k = 1; k <= mN; ++k) {
      final long gd = LongUtils.gcd(k, mN);
      sum = sum.add(gd == 1 ? k : 1);
    }
    return sum;
  }
}
