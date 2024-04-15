package irvine.oeis.a054;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A054784 Integers n such that sigma(2n) - sigma(n) is a power of 2, where sigma is the sum of the divisors of n.
 * @author Sean A. Irvine
 */
public class A054784 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    while (true) {
      if (Functions.SIGMA.z(2 * ++mN).subtract(Functions.SIGMA.z(mN)).bitCount() == 1) {
        return Z.valueOf(mN);
      }
    }
  }
}
