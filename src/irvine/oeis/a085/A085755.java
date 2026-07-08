package irvine.oeis.a085;

import irvine.factor.prime.Fast;
import irvine.math.MemoryFunctionInt3;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A085755 Number of partitions of n into a prime number of prime parts.
 * @author Sean A. Irvine
 */
public class A085755 extends AbstractSequence {

  // After Alois P. Heinz

  private int mN = 3;
  private long mP = 5;
  private final Fast mPrime = new Fast();
  private final MemoryFunctionInt3<Z> mB = new MemoryFunctionInt3<>() {
    @Override
    protected Z compute(final int n, final int p, final int t) {
      if (n < 0) {
        return Z.ZERO;
      }
      if (n == 0) {
        return mPrime.isPrime(t) ? Z.ONE : Z.ZERO;
      }
      if (p == 2) {
        return (n & 1) == 0 && mPrime.isPrime(t + n / 2) ? Z.ONE : Z.ZERO;
      }
      return get(n - p, p, t + 1).add(get(n, mPrime.prevPrime(p), t));
    }
  };

  /** Construct the sequence. */
  public A085755() {
    super(4);
  }

  @Override
  public Z next() {
    if (++mN > mP) {
      mP = mPrime.nextPrime(mP);
    }
    return mB.get(mN, (int) mP, 0);
  }
}
