package irvine.oeis.a064;

import irvine.factor.factor.LeastPrimeFactorizer;
import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.memory.MemorySequence;

/**
 * A064097 A quasi-logarithm defined inductively by a(1) = 0 and a(p) = 1 + a(p-1) if p is prime and a(n*m) = a(n) + a(m) if m,n &gt; 1.
 * @author Sean A. Irvine
 */
public class A064097 extends Sequence1 {

  private MemorySequence mSeq = new MemorySequence() {

    private final Fast mPrime = new Fast();

    {
      add(null);
    }

    @Override
    protected Z computeNext() {
      final int n = size();
      if (n == 1) {
        return Z.ZERO;
      }
      if (mPrime.isPrime(n)) {
        return a(n - 1).add(1);
      }
      final int lpf = LeastPrimeFactorizer.lpf(Z.valueOf(n)).intValueExact();
      return a(lpf).add(a(n / lpf));
    }
  };

  @Override
  public Z next() {
    return mSeq.next();
  }
}
