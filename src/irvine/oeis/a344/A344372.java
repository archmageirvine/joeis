package irvine.oeis.a344;

import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A344372 a(n) = Sum_{k=1..2n} (-1)^k gcd(k,2n).
 * @author Georg Fischer
 */
public class A344372 implements Sequence {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int k = 2 * mN; k >= 1; --k) {
      final long gd = LongUtils.gcd(k, 2 * mN);
      sum = sum.add(((k & 1) == 0) ? gd : -gd);
    }
    return sum;
  }
}
