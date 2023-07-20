package irvine.oeis.a064;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.memory.MemorySequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a063.A063994;

/**
 * A064234 The least k such that A063994(k) = Product_{primes p dividing k} gcd(p-1, k-1) = n, or 0 if there's no such k.
 * @author Sean A. Irvine
 */
public class A064234 extends Sequence1 {

  // After Richard N. Smith

  private final MemorySequence mA = MemorySequence.cachedSequence(new A063994());
  private final Fast mPrime = new Fast();
  private long mN = 0;

  @Override
  public Z next() {
    if ((++mN & 3) == 2 && !mPrime.isPrime(mN + 1)) {
      return Z.ZERO;
    }
    int k = -1;
    final Z n = Z.valueOf(mN);
    while (true) {
      if (mA.a(++k).equals(n)) {
        return Z.valueOf(k + 1);
      }
    }
  }
}
