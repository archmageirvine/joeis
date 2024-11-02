package irvine.oeis.a072;

import irvine.factor.prime.Fast;
import irvine.math.MemoryFunction3;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence2;
import irvine.oeis.a007.A007504;

/**
 * A072821 Largest prime that can appear in any representation of n as an arithmetic mean of distinct primes.
 * @author Sean A. Irvine
 */
public class A072821 extends Sequence2 {

  // After Alois P. Heinz

  private final DirectSequence mSumPrimes = DirectSequence.create(new A007504());
  private final Fast mPrime = new Fast();
  private Z mN = Z.ONE;

  private final MemoryFunction3<Z, Z> mB = new MemoryFunction3<>() {
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
        return get(n.subtract(i), pi, t.subtract(1)).signum() > 0 ? i : get(n, pi, t);
      }
    }
  };

  @Override
  public Z next() {
    mN = mN.add(1);
    Z s = Z.ONE;
    int k = 2;
    while (mSumPrimes.a(k).divide(k).compareTo(mN) <= 0) {
      final Z zk = Z.valueOf(k);
      final Z kn = zk.multiply(mN);
      s = s.max(mB.get(kn, mPrime.nextPrime(kn.subtract(mSumPrimes.a(k - 1)).subtract(1)), zk));
      ++k;
    }
    return s;
  }

}
