package irvine.oeis.a045;

import irvine.factor.factor.Cheetah;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A045939 Numbers n such that factorizations of n through n+2 have the same number of primes (including multiplicities).
 * @author Sean A. Irvine
 */
public class A045939 implements Sequence {

  private long mN = 32;

  protected long add() {
    return 2;
  }

  @Override
  public Z next() {
    outer:
    while (true) {
      final long s = Cheetah.factor(++mN).bigOmega();
      for (long k = 1; k <= add(); ++k) {
        if (Cheetah.factor(mN + k).bigOmega() != s) {
          continue outer;
        }
      }
      return Z.valueOf(mN);
    }
  }
}
