package irvine.oeis.a036;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A036339 Concatenation of prime p and nextprime(p) is prime -&gt; cycles of 2 steps possible.
 * @author Sean A. Irvine
 */
public class A036339 implements Sequence {

  private final Fast mPrime = new Fast();
  private long mP = 466;

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      final Z q0 = new Z(mP + String.valueOf(mPrime.nextPrime(mP)));
      if (q0.isProbablePrime() && new Z(q0.toString() + mPrime.nextPrime(q0)).isProbablePrime()) {
        return Z.valueOf(mP);
      }
    }
  }
}
