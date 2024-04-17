package irvine.oeis.a046;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A046308 Numbers that are divisible by exactly 7 primes counting multiplicity.
 * @author Sean A. Irvine
 */
public class A046308 extends Sequence1 {

  private long mN = 127;

  @Override
  public Z next() {
    while (true) {
      if (Functions.BIG_OMEGA.l(++mN) == 7) {
        return Z.valueOf(mN);
      }
    }
  }
}
