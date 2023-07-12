package irvine.oeis.a064;

import irvine.factor.prime.Fast;
import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A064467 Primes in Pi: a(n) = first position in decimal expansion of Pi that matches the n-th prime, or 0 if there is no such position.
 * @author Sean A. Irvine
 */
public class A064467 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private String mPi = CR.PI.toString(100).replace(".", "");
  private long mP = 1;

  @Override
  public Z next() {
    mP = mPrime.nextPrime(mP);
    final String p = String.valueOf(mP);
    while (true) {
      final int pos = mPi.indexOf(p);
      if (pos >= 0) {
        return Z.valueOf(pos + 1);
      }
      mPi = "3" + CR.PI.toString(2 * mPi.length()).substring(2);
    }
  }
}
