package irvine.oeis.a060;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A060326 Numbers n such that 2*n - sigma(n) is a divisor of n and greater than one, where sigma = A000203 is the sum of divisors.
 * @author Sean A. Irvine
 */
public class A060326 extends Sequence1 {

  private long mN = 9;

  @Override
  public Z next() {
    while (true) {
      final long t = 2 * ++mN - Jaguar.factor(mN).sigma().longValueExact();
      if (t > 1 && mN % t == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
