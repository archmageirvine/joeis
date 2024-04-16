package irvine.oeis.a051;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A051270 Numbers that are divisible by exactly 5 different primes.
 * @author Sean A. Irvine
 */
public class A051270 extends Sequence1 {

  private long mN = 209;

  @Override
  public Z next() {
    while (true) {
      if (Functions.OMEGA.i(++mN) == 5) {
        return Z.valueOf(mN);
      }
    }
  }
}
