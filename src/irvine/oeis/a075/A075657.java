package irvine.oeis.a075;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A075657 Numbers n such that sum of digits (A007953) is a divisor of sum of prime divisors (A008472).
 * @author Sean A. Irvine
 */
public class A075657 extends Sequence1 {

  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      if (Functions.SOPF.l(++mN) % Functions.DIGIT_SUM.l(mN) == 0) {
        return Z.valueOf(mN);
      }
    }
  }
}
