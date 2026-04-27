package irvine.oeis.a395;

import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A395264 Primes p such that the number of quadratic residues in the Lucas sequence A000032 modulo p over a full Lucas sequence period A106291(p) equals the number of nonresidues plus the number of terms divisible by p.
 * @author Sean A. Irvine
 */
public class A395264 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private long mP = 2;

  private boolean is(final long p) {
    long a = 2;
    long b = 1;
    long sum = 0;
    do {
      sum += Functions.JACOBI.i(a, p) == 1 ? 1 : -1;
      final long t = (a + b) % mP;
      a = b;
      b = t;
    } while (a != 2 || b != 1);
    return sum == 0;
  }

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      if (is(mP)) {
        return Z.valueOf(mP);
      }
    }
  }
}
