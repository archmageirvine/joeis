package irvine.oeis.a046;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A046309 Numbers that are divisible by at least 8 primes (counted with multiplicity).
 * @author Sean A. Irvine
 */
public class A046309 extends Sequence1 {

  private long mN = 255;

  @Override
  public Z next() {
    while (true) {
      if (Functions.BIG_OMEGA.l(++mN) >= 8) {
        return Z.valueOf(mN);
      }
    }
  }
}
