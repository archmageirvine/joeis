package irvine.oeis.a036;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A036340 Concatenation of prime p and nextprime(p) is prime -&gt; cycles of 3 steps possible.
 * @author Sean A. Irvine
 */
public class A036340 extends Sequence0 {

  private final Fast mPrime = new Fast();
  private long mP = 466;

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      final Z q0 = new Z(mP + String.valueOf(mPrime.nextPrime(mP)));
      if (q0.isProbablePrime()) {
        final Z q1 = new Z(q0.toString() + mPrime.nextPrime(q0));
        if (q1.isProbablePrime() && new Z(q1.toString() + mPrime.nextPrime(q1)).isProbablePrime()) {
          return Z.valueOf(mP);
        }
      }
    }
  }
}
