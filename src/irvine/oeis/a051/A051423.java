package irvine.oeis.a051;

import irvine.math.LongUtils;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A051423 Numbers k such that the sum of prime divisors of k is congruent to 2^k (mod k).
 * @author Sean A. Irvine
 */
public class A051423 extends Sequence1 {

  private long mN = 14;

  @Override
  public Z next() {
    while (true) {
      if (Functions.SOPFR.z(++mN).mod(mN) == LongUtils.modPow(2, mN, mN)) {
        return Z.valueOf(mN);
      }
    }
  }
}
