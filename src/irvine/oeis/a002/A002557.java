package irvine.oeis.a002;

import java.util.ArrayList;
import java.util.Collections;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A002557 Odd squarefree numbers with an even number of prime factors that have no prime factors greater than 31.
 * @author Sean A. Irvine
 */
public class A002557 implements Sequence {

  private final ArrayList<Long> mTerms = new ArrayList<>();
  private int mN = -1;

  {
    final Fast prime = new Fast();
    final ArrayList<Long> primes = new ArrayList<>();
    for (long p = 3; p <= 31; p = prime.nextPrime(p)) {
      primes.add(p);
    }
    final long limit = 1L << primes.size();
    for (long s = 3; s < limit; ++s) {
      if ((Long.bitCount(s) & 1) == 0) {
        long product = 1;
        for (int k = 0; k < primes.size(); ++k) {
          if ((s & (1L << k)) != 0) {
            product *= primes.get(k);
          }
        }
        mTerms.add(product);
      }
    }
    mTerms.add(1L);
    Collections.sort(mTerms);
  }

  @Override
  public Z next() {
    if (++mN >= mTerms.size()) {
      return null;
    }
    return Z.valueOf(mTerms.get(mN));
  }
}
