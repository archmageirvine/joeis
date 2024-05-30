package irvine.oeis.a055;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A055006 a(n) is the least multiple of n such that a(n) = 1 mod k for all integers k with 1 &lt; k &lt; n and k relatively prime to n.
 * @author Sean A. Irvine
 */
public class A055006 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    if (++mN <= 2) {
      return Z.valueOf(mN); // avoid problems with lcm=1
    }
    Z lcm = Z.ONE;
    for (long k = 2; k < mN; ++k) {
      if (Functions.GCD.l(mN, k) == 1) {
        lcm = lcm.lcm(Z.valueOf(k));
      }
    }
    return Z.valueOf(mN).modInverse(lcm).multiply(mN);
  }
}
