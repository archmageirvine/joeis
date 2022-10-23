package irvine.oeis.a051;

import irvine.factor.factor.Jaguar;
import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A051423 Sum of prime divisors of n is congruent to 2^n (mod n).
 * @author Sean A. Irvine
 */
public class A051423 extends Sequence1 {

  private long mN = 14;

  @Override
  public Z next() {
    while (true) {
      if (Jaguar.factor(++mN).sopfr().mod(mN) == LongUtils.modPow(2, mN, mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
