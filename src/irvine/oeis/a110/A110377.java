package irvine.oeis.a110;
// manually sumsi/sumgcd1 at 2021-11-20 19:26

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A110377 a(n) = Sum_{r &lt; n, gcd(r,n)=1} n!/r!.
 * @author Georg Fischer
 */
public class A110377 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    Z sum = Z.ZERO;
    for (int k = 1; k <= mN; ++k) {
      final long gd = Functions.GCD.l(mN, k);
      if (gd == 1) {
        sum = sum.add(Functions.FACTORIAL.z(mN).divide(Functions.FACTORIAL.z(k)));
      }
    }
    return sum;
  }
}
