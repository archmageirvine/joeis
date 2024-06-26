package irvine.oeis.a014;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A014612 Numbers that are the product of exactly three (not necessarily distinct) primes.
 * @author Sean A. Irvine
 */
public class A014612 extends Sequence1 {

  private long mN = 7;

  @Override
  public Z next() {
    while (true) {
      if (Functions.BIG_OMEGA.l(++mN) == 3) {
        return Z.valueOf(mN);
      }
    }
  }
}
