package irvine.oeis.a038;

import irvine.factor.prime.Fast;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A038873 Primes p such that 2 is a square mod p; or, primes congruent to {1, 2, 7} mod 8.
 * @author Georg Fischer
 */
public class A038873 extends Sequence1 {

  private final Fast mPrime;
  private long mP; // current prime number
  protected long mSquare; // this should be a square mod p
  protected boolean mPolar; // true if mSquare should be a square mod p, false if not

  /** Construct the sequence. */
  public A038873() {
    this(2, true);
  }

  /**
   * Constructor with parameters.
   * @param square this should be a square mod p
   * @param polar true if square should be a square mod p, false if not
   */
  public A038873(final int square, final boolean polar) {
    mP = 1;
    mSquare = square;
    mPolar = polar;
    mPrime = new Fast();
  }

  @Override
  public Z next() {
    while (true) {
      mP = mPrime.nextPrime(mP);
      if ((Functions.KRONECKER.i(mSquare, mP) == -1) ^ mPolar) {
        return Z.valueOf(mP);
      }
    }
  }
}
