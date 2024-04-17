package irvine.oeis.a045;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A045920 Numbers m such that the factorizations of m..m+1 have the same number of primes (including multiplicities).
 * @author Sean A. Irvine
 */
public class A045920 extends Sequence1 {

  private long mN = 1;

  @Override
  public Z next() {
    while (true) {
      if (Functions.BIG_OMEGA.l(++mN) == Functions.BIG_OMEGA.l(mN + 1)) {
        return Z.valueOf(mN);
      }
    }
  }
}
