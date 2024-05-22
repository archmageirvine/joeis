package irvine.oeis.a054;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A054799 Integers n such that sigma(n+2) = sigma(n) + 2, where sigma = A000203, the sum of divisors of n.
 * @author Sean A. Irvine
 */
public class A054799 extends Sequence1 {

  private long mN = 2;

  @Override
  public Z next() {
    while (true) {
      if (Functions.SIGMA1.z(++mN).add(2).equals(Functions.SIGMA1.z(mN + 2))) {
        return Z.valueOf(mN);
      }
    }
  }
}
