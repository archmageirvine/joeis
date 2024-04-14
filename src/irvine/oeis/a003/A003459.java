package irvine.oeis.a003;

import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.Permutation;

/**
 * A003459 Absolute primes (or permutable primes): every permutation of the digits is a prime.
 * @author Sean A. Irvine
 */
public class A003459 extends Sequence1 {

  // Based on results in A. Slinko, "Absolute Primes"
  // Excluding single digit cases, can only have digits 1, 3, 7, 9.
  // But cannot have all of 1, 3, 7, 9.
  // If not a repunit the length must divide 11088.

  private static final int MASK = (1 << 1) + (1 << 3) + (1 << 7) + (1 << 9);
  private final Fast mPrime = new Fast();
  private long mP = 1;
  private Z mR = new Z("111111111111111111");

  private boolean testPermutations(final long prime) {
    final String s = String.valueOf(prime);
    final Permutation perm = new Permutation(s.length());
    int[] p;
    while ((p = perm.next()) != null) {
      long u = 0;
      for (final int k : p) {
        u *= 10;
        u += s.charAt(k) - '0';
      }
      if (!mPrime.isPrime(u)) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    while (mP <= 991) {
      mP = mPrime.nextPrime(mP);
      if (mP <= 7) {
        return Z.valueOf(mP);
      }
      final int syndrome = Functions.SYNDROME.i(mP);
      if ((syndrome & ~MASK) == 0 && (syndrome & MASK) != MASK && testPermutations(mP)) {
        return Z.valueOf(mP);
      }
    }
    // In the repunit realm
    while (true) {
      mR = mR.multiply(10).add(1);
      final int len = mR.toString().length();
      if (len >= 11088) {
        throw new UnsupportedOperationException();
      }
      // Prime repunit must have prime number of digits
      if (mPrime.isPrime(len) && mR.isProbablePrime()) {
        return mR;
      }
    }
  }
}
