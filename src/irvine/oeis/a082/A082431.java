package irvine.oeis.a082;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A082431 a(n) = the smallest prime p such that there are exactly n sets of consecutive primes, each of which has an arithmetic mean of p.
 * @author Sean A. Irvine
 */
public class A082431 extends Sequence1 {

  // After Rick L. Shepherd

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    long m = 2;
    long startingIndex = 1;
    long k = startingIndex;
    long sumOfPrimes = 0;
    int primeCount = 0;
    int sets = 0;
    while (Functions.PRIME.l(startingIndex) <= m || sets != mN) {
      if (Functions.PRIME.l(startingIndex) > m || sets > mN) {
        m = Functions.NEXT_PRIME.l(m);
        sets = 0;
        startingIndex = 1;
        k = startingIndex;
      }
      sumOfPrimes += Functions.PRIME.l(k);
      ++primeCount;
      if (sumOfPrimes < m * primeCount) {
        ++k;
      } else {
        if (sumOfPrimes == m * primeCount) {
          ++sets;
        }
        sumOfPrimes = 0;
        primeCount = 0;
        k = ++startingIndex;
      }
    }
    return Z.valueOf(m);
  }
}
