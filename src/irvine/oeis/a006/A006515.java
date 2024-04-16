package irvine.oeis.a006;

import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A006515 Mersenne numbers with at most 2 prime factors.
 * @author Sean A. Irvine
 */
public class A006515 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mP = 1;

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      final Z n = Z.ONE.shiftLeft(mP).subtract(1);
      if (Functions.OMEGA.i(n) < 3) {
        return n;
      }
    }
  }
}
