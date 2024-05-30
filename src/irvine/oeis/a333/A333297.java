package irvine.oeis.a333;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A333297 a(n) = Sum_{i=1..n, j=1..n, gcd(i,j)=1} i.
 * @author Georg Fischer
 */
public class A333297 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int i = 1; i <= mN; ++i) {
      for (int j = 1; j <= mN; ++j) {
        if (Functions.GCD.l(i, j) == 1) {
          sum = sum.add(i);
        }
      }
    }
    return sum;
  }
}
