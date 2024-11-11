package irvine.oeis.a073;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A073030 Sum_{k=1..n, gcd(n,k) = 1} 10^(k-1).
 * @author Sean A. Irvine
 */
public class A073030 extends Sequence2 {

  private long mN = 1;

  @Override
  public Z next() {
    ++mN;
    Z res = Z.ZERO;
    for (long k = mN; k > 0; --k) {
      res = res.multiply(10);
      if (Functions.GCD.l(k, mN) == 1) {
        res = res.add(1);
      }
    }
    return res;
  }
}
