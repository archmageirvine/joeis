package irvine.oeis.a181;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.Sequence1;

/**
 * A181447 Numbers n such that 3 is the largest prime factor of n^2 - 1.
 * <code>is(n)=n=n^2-1; forprime(p=2, 13, n/=p^valuation(n, p)); n&gt;1 && 17^valuation(n, 17)==n</code>.
 * @author Georg Fischer
 */
public class A181447 extends Sequence1 {

  private int mN;
  private final int mPrime;
  private final Z mPrimeZ;
  private static final int[] PRIMES = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101};

  /** Construct the sequence. */
  public A181447() {
    this(3);
  }

  /**
   * Generic constructor with parameters
   * @param prime the prime
   */
  public A181447(final int prime) {
    mN = 0;
    mPrime = prime;
    mPrimeZ = Z.valueOf(prime);
  }

  private boolean isOk(final int n) {
    Z n2 = Z.valueOf(n).square().subtract(1);
    final Z[] quot = n2.divideAndRemainder(mPrimeZ);
    if (!quot[1].isZero()) {
      return false;
    }
    int ip = 0;
    while (PRIMES[ip] < mPrime) {
      final Z pz = Z.valueOf(PRIMES[ip]);
      n2 = n2.divide(pz.pow(ZUtils.valuation(n2, pz)));
      ++ip;
    }
    return n2.compareTo(Z.ONE) > 0 && mPrimeZ.pow(ZUtils.valuation(n2, mPrimeZ)).equals(n2);
  }

  @Override
  public Z next() {
    while (!isOk(++mN)) {
    }
    return Z.valueOf(mN);
  }
}
