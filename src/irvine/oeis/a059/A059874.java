package irvine.oeis.a059;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A059874 The lexicographically earliest sequence of binary encodings of solutions satisfying the equation p_i = (1+mod(i,2))*p_{i-1} +- p_{i-2} +- p_{i-3} +- ... +- 2 + 1, where p_i is the i-th prime number.
 * @author Sean A. Irvine
 */
public class A059874 implements Sequence {

  private final Fast mPrime = new Fast();
  private long mP = 1;
  private int mN = 0;

  private long search(final long sum, final long p, final long k, final long pattern) {
    if (k <= 0) {
      if (sum == 0) {
        return (pattern << 1) + 1;
      }
      return 0;
    }
    final long q = mPrime.prevPrime(p);
    final long a = search(sum - q, q, k - 1, pattern << 1);
    if (a > 0) {
      return a;
    }
    return search(sum + q, q, k - 1, (pattern << 1) + 1);
  }

  @Override
  public Z next() {
    if (++mN > 63) {
      throw new UnsupportedOperationException("Need to move pattern from long -> Z");
    }
    final long q = mP;
    mP = mPrime.nextPrime(mP);
    if (mN == 1) {
      return Z.ONE;
    }
    // + 1 as this is always required for this sequence
    return Z.valueOf(search(q * (1 + (mN & 1)) + 1 - mP, q, mN - 2, 1L));
  }
}
