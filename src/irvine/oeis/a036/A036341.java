package irvine.oeis.a036;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A036341 Concatenation of prime p and nextprime(p) is prime -&gt; cycles of 4 steps possible.
 * @author Sean A. Irvine
 */
public class A036341 implements Sequence {

  private final Fast mPrime = new Fast();
  private long mP = 127787376;

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      final Z q0 = new Z(mP + String.valueOf(mPrime.nextPrime(mP)));
      if (q0.isProbablePrime()) {
        final Z q1 = new Z(q0.toString() + mPrime.nextPrime(q0));
        if (q1.isProbablePrime()) {
          final Z q2 = new Z(q1.toString() + mPrime.nextPrime(q1));
          if (q2.isProbablePrime() && new Z(q2.toString() + mPrime.nextPrime(q2)).isProbablePrime()) {
            return Z.valueOf(mP);
          }
        }
      }
    }
  }
}
