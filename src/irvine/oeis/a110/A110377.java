package irvine.oeis.a110;
// manually sumsi/sumgcd1 at 2021-11-20 19:26

import irvine.math.LongUtils;
import irvine.math.factorial.MemoryFactorial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A110377 a(n) = Sum_{r &lt; n, gcd(r,n)=1} n!/r!.
 * @author Georg Fischer
 */
public class A110377 implements Sequence {

  private int mN = 0;
  private static final MemoryFactorial FACTORIAL = new MemoryFactorial();

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int k = 1; k <= mN; ++k) {
      final long gd = LongUtils.gcd(mN, k);
      if (gd == 1) {
        sum = sum.add(FACTORIAL.factorial(mN).divide(FACTORIAL.factorial(k)));
      }
    }
    return sum;
  }
}
