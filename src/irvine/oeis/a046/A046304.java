package irvine.oeis.a046;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A046304 Divisible by at least 5 primes (counted with multiplicity).
 * @author Sean A. Irvine
 */
public class A046304 extends Sequence1 {

  private long mN = 31;

  @Override
  public Z next() {
    while (true) {
      if (Functions.BIG_OMEGA.l(++mN) >= 5) {
        return Z.valueOf(mN);
      }
    }
  }
}
