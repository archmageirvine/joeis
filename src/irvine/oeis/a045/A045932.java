package irvine.oeis.a045;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A045932 Numbers n such that n through n+3 are divisible by the same number of distinct primes.
 * @author Sean A. Irvine
 */
public class A045932 extends Sequence1 {

  private long mN = 1;

  protected long add() {
    return 3;
  }

  @Override
  public Z next() {
    outer:
    while (true) {
      final long s = Functions.OMEGA.i(++mN);
      for (long k = 1; k <= add(); ++k) {
        if (Functions.OMEGA.i(mN + k) != s) {
          continue outer;
        }
      }
      return Z.valueOf(mN);
    }
  }
}
