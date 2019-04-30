package irvine.oeis.a003;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.a000.A000961;

/**
 * A003424 Primes of form (p^x - 1)/(p^y <code>- 1)</code>, p prime.
 * @author Sean A. Irvine
 */
public class A003424 implements Sequence {

  // We are after primes, q, of the form q = (p^r - 1) / (p^d - 1), where p is also prime.
  // It can be proven that r must be a prime power and that d must be the penultimate
  // divisor of r.

  // Certain amount of heuristics used here, to bound how far to look in terms of powers.
  // The implementation does have checking and will detect if the heuristic leads to out
  // of order terms.

  // Our first task is maintaining lists of r and d.  Possible values for r are given by
  // A000961 (excluding the first term).
  private final A000961 mPrimePowersSequence = new A000961();
  {
    mPrimePowersSequence.next(); // skip leading 1
  }
  private final ArrayList<Integer> mR = new ArrayList<>();
  private final ArrayList<Integer> mD = new ArrayList<>();

  private int computeD(final int r) {
    int d = r;
    while (true) {
      if (r % --d == 0) {
        return d;
      }
    }
  }

  private void ensurePrimePowers(final int r) {
    while (mR.isEmpty() || mR.get(mR.size() - 1) < r) {
      final int next = mPrimePowersSequence.next().intValueExact();
      mR.add(next);
      mD.add(computeD(next));
    }
  }

  // This is the queue of primes q not yet output.  Before outputting the current
  // head use some heuristics to make sure we have considered enough primes p and
  // powers r.
  private final TreeMap<Z, Integer> mPriority = new TreeMap<>();
  private final Fast mPrime = new Fast();
  private Z mLastPrimeUsed = Z.ONE;
  private Z mLastReturn = Z.ZERO;

  private void ensurePowers(final List<Z> lst, final int power) {
    final Z p = lst.get(1);
    while (lst.size() <= power) {
      lst.add(lst.get(lst.size() - 1).multiply(p));
    }
  }

  private void handlePrime(final Z p, final int minIndex) {
    final ArrayList<Z> powersOfPrime = new ArrayList<>();
    powersOfPrime.add(Z.ONE);
    powersOfPrime.add(p);
    for (int k = minIndex; k < mR.size(); ++k) {
      final int r = mR.get(k);
      ensurePowers(powersOfPrime, r);
      final Z[] q = powersOfPrime.get(r).subtract(1)
        .divideAndRemainder(powersOfPrime.get(mD.get(k)).subtract(1));
      if (Z.ZERO.equals(q[1]) && q[0].isProbablePrime()) {
        mPriority.put(q[0], r);
      }
    }
  }

  private boolean needUpdate() {
    if (mPriority.isEmpty()) {
      ensurePrimePowers(2);
      return true;
    }
    final Map.Entry<Z, Integer> pair = mPriority.firstEntry();
    final int h = 2 * pair.getValue();
    if (h > mR.size()) {
      // Need to upgrade the powers of all primes considered so far
      final int min = mR.size();
      ensurePrimePowers(h);
      for (Z p = Z.TWO; p.compareTo(mLastPrimeUsed) <= 0; p = mPrime.nextPrime(p)) {
        handlePrime(p, min);
      }
    }
    return mLastPrimeUsed.square().compareTo(pair.getKey()) < 0;
  }

  @Override
  public Z next() {
    while (needUpdate()) {
      mLastPrimeUsed = mPrime.nextPrime(mLastPrimeUsed);
      handlePrime(mLastPrimeUsed, 0);
    }
    final Z res = mPriority.pollFirstEntry().getKey();
    if (res.compareTo(mLastReturn) <= 0) {
      throw new UnsupportedOperationException("Out of order: " + res + " r size=" + mR.size());
    }
    mLastReturn = res;
    return res;
  }
}
