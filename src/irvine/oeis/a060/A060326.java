package irvine.oeis.a060;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A060326 Numbers m such that 2*m - sigma(m) is a divisor of m and greater than one, where sigma = A000203 is the sum of divisors.
 * @author Sean A. Irvine
 */
public class A060326 extends Sequence1 {

  private long mN = 9;

  @Override
  public Z next() {
    while (true) {
      final long t = 2 * ++mN - Functions.SIGMA1.l(mN);
      if (t > 1 && mN % t == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
