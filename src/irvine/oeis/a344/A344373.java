package irvine.oeis.a344;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A344373 a(n) = Sum_{k=1..n-1} (-1)^k gcd(k, n).
 * @author Georg Fischer
 */
public class A344373 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int k = mN - 1; k >= 1; --k) {
      final long gd = Functions.GCD.l(k, mN);
      sum = sum.add(((k & 1) == 0) ? gd : -gd);
    }
    return sum;
  }
}
