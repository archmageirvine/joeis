package irvine.oeis.a033;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A033987 Numbers that are divisible by at least 4 primes (counted with multiplicity).
 * @author Sean A. Irvine
 */
public class A033987 extends Sequence1 {

  private long mN = 15;

  @Override
  public Z next() {
    while (true) {
      if (Functions.BIG_OMEGA.l(++mN) >= 4) {
        return Z.valueOf(mN);
      }
    }
  }
}
