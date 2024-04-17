package irvine.oeis.a046;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A046314 Numbers that are divisible by exactly 10 primes with multiplicity.
 * @author Sean A. Irvine
 */
public class A046314 extends Sequence1 {

  private long mN = 1023;

  @Override
  public Z next() {
    while (true) {
      if (Functions.BIG_OMEGA.l(++mN) == 10) {
        return Z.valueOf(mN);
      }
    }
  }
}
