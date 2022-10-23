package irvine.oeis.a053;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A053558 Primes formed by concatenating n consecutive increasing numbers starting with a prime and ending with the next consecutive prime.
 * @author Sean A. Irvine
 */
public class A053558 extends Sequence1 {

  private Z mP = Z.ONE;
  private final Fast mPrime = new Fast();

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      final StringBuilder sb = new StringBuilder();
      Z q = mP;
      do {
        sb.append(q);
        q = q.add(1);
      } while (!q.isProbablePrime());
      sb.append(q);
      final Z t = new Z(sb);
      if (t.isProbablePrime()) {
        return t;
      }
    }
  }
}
