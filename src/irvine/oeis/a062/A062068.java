package irvine.oeis.a062;
// manually 2023-03-01

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A062068 a(n) = d(sigma(n)), where d(k) is the number of divisors function (A000005) and sigma(k) is the sum of divisor function (A000203).
 * @author Georg Fischer
 */
public class A062068 extends Sequence1 {

  private int mN = 0;

  @Override
  public Z next() {
    return Jaguar.factor(Jaguar.factor(++mN).sigma()).sigma0();
  }
}
