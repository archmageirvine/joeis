package irvine.oeis.a045;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A045932 Numbers n such that n through n+3 are divisible by the same number of distinct primes.
 * @author Sean A. Irvine
 */
public class A045932 implements Sequence {

  private long mN = 1;

  protected long add() {
    return 3;
  }

  @Override
  public Z next() {
    outer:
    while (true) {
      final long s = Jaguar.factor(++mN).omega();
      for (long k = 1; k <= add(); ++k) {
        if (Jaguar.factor(mN + k).omega() != s) {
          continue outer;
        }
      }
      return Z.valueOf(mN);
    }
  }
}
