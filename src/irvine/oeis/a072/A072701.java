package irvine.oeis.a072;

import irvine.factor.prime.Fast;
import irvine.math.MemoryFunction3;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.DirectSequence;
import irvine.oeis.a007.A007504;

/**
 * A072701 Number of ways to write n as the arithmetic mean of a set of distinct primes.
 * @author Sean A. Irvine
 */
public class A072701 extends AbstractSequence {

  // After Alois P. Heinz

  protected final DirectSequence mSumPrimes = DirectSequence.create(new A007504());
  protected final Fast mPrime = new Fast();
  protected Z mN;

  protected final MemoryFunction3<Z, Z> mB = new MemoryFunction3<>() {
    @Override
    protected Z compute(final Z n, final Z i, final Z t) {
      if (n.signum() < 0) {
        return Z.ZERO;
      } else if (Z.ZERO.equals(n)) {
        return t.isZero() ? Z.ONE : Z.ZERO;
      } else if (Z.TWO.equals(i)) {
        return Z.ONE.equals(t) && Z.TWO.equals(n) ? Z.ONE : Z.ZERO;
      } else {
        final Z pi = mPrime.prevPrime(i);
        return get(n, pi, t).add(get(n.subtract(i), pi, t.subtract(1)));
      }
    }
  };

  protected A072701(final int offset) {
    super(offset);
    mN = Z.valueOf(offset - 1);
  }

  /** Construct the sequence. */
  public A072701() {
    this(1);
  }

  @Override
  public Z next() {
    mN = mN.add(1);
    Z sum = mPrime.isPrime(mN) ? Z.ONE : Z.ZERO;
    for (int k = 2; mSumPrimes.a(k).divide(k).compareTo(mN) <= 0; ++k) {
      final Z zk = Z.valueOf(k);
      final Z kn = zk.multiply(mN);
      sum = sum.add(mB.get(kn, mPrime.nextPrime(kn.subtract(mSumPrimes.a(k - 1)).subtract(1)), zk));
    }
    return sum;
  }

}
