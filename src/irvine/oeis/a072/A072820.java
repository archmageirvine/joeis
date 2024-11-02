package irvine.oeis.a072;

import irvine.math.z.Z;

/**
 * A072820 Largest number of distinct primes to represent n as arithmetic mean.
 * @author Sean A. Irvine
 */
public class A072820 extends A072701 {

  /** Construct the sequence. */
  public A072820() {
    super(2);
  }

  @Override
  public Z next() {
    mN = mN.add(1);
    if (mN.compareTo(Z.FOUR) < 0) {
      return Z.ONE;
    }
    int k = 2;
    while (mSumPrimes.a(k).divide(k).compareTo(mN) <= 0) {
      ++k;
    }
    while (true) {
      --k;
      final Z zk = Z.valueOf(k);
      final Z kn = zk.multiply(mN);
      if (mB.get(kn, mPrime.nextPrime(kn.subtract(mSumPrimes.a(k - 1)).subtract(1)), zk).signum() > 0) {
        return zk;
      }
    }
  }

}
