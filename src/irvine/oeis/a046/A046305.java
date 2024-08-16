package irvine.oeis.a046;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A046305 Divisible by at least 6 primes (counted with multiplicity).
 * @author Sean A. Irvine
 */
public class A046305 extends Sequence1 {

  private long mN = 63;

  @Override
  public Z next() {
    while (true) {
      if (Functions.BIG_OMEGA.l(++mN) >= 6) {
        return Z.valueOf(mN);
      }
    }
  }
}
