package irvine.oeis.a045;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A045939 Numbers m such that the factorizations of m..m+2 have the same number of primes (including multiplicities).
 * @author Sean A. Irvine
 */
public class A045939 extends Sequence1 {

  private long mN = 32;

  protected long add() {
    return 2;
  }

  @Override
  public Z next() {
    outer:
    while (true) {
      final long s = Functions.BIG_OMEGA.l(++mN);
      for (long k = 1; k <= add(); ++k) {
        if (Functions.BIG_OMEGA.l(mN + k) != s) {
          continue outer;
        }
      }
      return Z.valueOf(mN);
    }
  }
}
