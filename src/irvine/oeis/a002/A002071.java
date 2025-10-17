package irvine.oeis.a002;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import irvine.factor.prime.Fast;
import irvine.math.api.Set;
import irvine.math.set.FiniteSet;
import irvine.math.z.PellIterator;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A002071 Number of pairs of consecutive integers x, x+1 such that all prime factors of both x and x+1 are at most the n-th prime.
 * @author Sean A. Irvine
 */
public class A002071 extends Sequence1 {

  // Fundamentally this works using the Lehmer's improvements to Stormer's theorem
  // Implementation is based on the Python code by D. Eppstein.

  private long mP = 1;
  private final ArrayList<Long> mPrimes = new ArrayList<>();
  private final Fast mPrime = new Fast();
  protected Z mLargestSolution = Z.ZERO;

  private static Z product(final Set<Long> s) {
    Z p = Z.ONE;
    for (final long v : s) {
      p = p.multiply(v);
    }
    return p;
  }

  private static boolean isSmooth(Z q, final Collection<Long> primes) {
    for (final long p : primes) {
      while (q.mod(p) == 0) {
        q = q.divide(p);
      }
    }
    return Z.ONE.equals(q);
  }

  private boolean isSingleton2(final Set<Long> s) {
    return Z.ONE.equals(s.size()) && s.iterator().next() == 2;
  }

  // Assume primes is sorted from smallest to largest, all distinct
  private long stormer(final List<Long> primes) {
    long numberOfSolutions = 0;
    final int nterms = Math.max(3, (primes.get(primes.size() - 1).intValue() + 1) >> 1);
    for (final Set<Long> s : new FiniteSet<>(primes).powerset()) {
      if (isSingleton2(s)) {
        continue; // skip empty cases
      }
      final Iterator<Z[]> it = new PellIterator(product(s).multiply2());
      for (int k = 0; k < nterms; ++k) {
        final Z[] xy = it.next();
        final Z y = xy[1];
        if (isSmooth(y, primes)) {
          ++numberOfSolutions;
          // This next part gets the actual solution
          final Z x = xy[0];
          final Z z = x.subtract(1).divide2(); // The lower of the pair
          // Remember the largest solution (needed for A002072
          if (z.compareTo(mLargestSolution) > 0) {
            mLargestSolution = z;
          }
        } else if (k == 0) {
          break;
        }
      }
    }
    return numberOfSolutions;
  }

  @Override
  public Z next() {
    mP = mPrime.nextPrime(mP);
    mPrimes.add(mP);
    return Z.valueOf(stormer(mPrimes));
  }
}
