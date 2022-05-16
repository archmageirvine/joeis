package irvine.oeis.a019;

import java.util.ArrayList;

import irvine.factor.factor.Jaguar;
import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A019312 Taxman sequence: define T(S) by max{x+T(S \ {c : c|x})}, where the max is over all x in S for which S also contains a proper divisor of x; if no such x exists, T(S)=0; set T(n)=T({1,...,n}).
 * @author Sean A. Irvine
 */
public class A019312 implements Sequence {

  // Taxman

  private final Fast mPrime = new Fast();
  private final ArrayList<int[]> mDivisors = new ArrayList<>();
  {
    mDivisors.add(null); // 0th
    mDivisors.add(new int[] {1}); // 1st
  }
  private Z mPrev = Z.ONE;
  private int mN = 0;
  private int mMinTaxman;

  private int maxAvailable(final int[] taken, final int max) {
    int m = max;
    while (m > 0 && taken[m] != 0) {
      --m;
    }
    return m;
  }

  private int minAvailable(final int[] taken, final int min) {
    int m = min;
    while (m < taken.length && taken[m] != 0) {
      ++m;
    }
    return m;
  }

  private int take(final int[] taken, final int n, final int depth, final int min, final int max) {
    // Choosing element n, compute all values taken by taxman as a result
    int tax = 0;
    taken[n] = depth;
    for (final int d : mDivisors.get(n)) {
      if (taken[d] == 0) {
        taken[d] = depth;
        tax += d;
      }
    }
    if (tax == 0) {
      return n; // taxman took this number
    }
    // Eliminate all other numbers the worker can no longer select, because they
    // no longer have factors available for selection and are not factors of
    // larger possible selections.  The search will still work without the following
    // section, but it makes the search faster.
    for (int k = max; k >= min; --k) {
      if (taken[k] == 0) {
        boolean forbidden = true;
        for (int j = k + k; j <= max; j += k) {
          if (taken[j] == 0) {
            forbidden = false;
            break;
          }
        }
        if (forbidden) {
          for (int j : mDivisors.get(k)) {
            if (taken[j] == 0) {
              forbidden = false;
              break;
            }
          }
          if (forbidden) {
            taken[k] = depth;
            tax += k;
          }
        }
      }
    }
    return tax;
  }

  private void release(final int[] taken, final int depth) {
    for (int k = taken.length - 1; k > 0; --k) {
      if (taken[k] == depth) {
        taken[k] = 0;
      }
    }
  }

  // taken keeps track of already picked numbers by player or taxman
  // taxmanSum is how much money the taxman is guaranteed so far
  // depth is depth of recursion, used to make it easier to unwind plays
  // all numbers below minAvailable have already been picked
  // all numbers above maxAvailable have already been picked
  private void search(final int[] taken, final int taxmanSum, final int depth, final int minAvailable, final int maxAvailable) {
    if (taxmanSum >= mMinTaxman) {
      return; // already matched or exceed current best solution
    }
    final int max = maxAvailable(taken, maxAvailable);
    if (max == 0) {
      if (taxmanSum < mMinTaxman) {
        mMinTaxman = taxmanSum;
      }
      return;
    }
    final int min = minAvailable(taken, minAvailable);
    for (int k = max; k >= min; --k) {
      if (taken[k] == 0) {
        final int take = take(taken, k, depth, min, max);
        if (take != 0) {
          search(taken, taxmanSum + take, depth + 1, min, max);
        }
        release(taken, depth);
      }
    }
  }

  @Override
  public Z next() {
    // Update precomputed divisors for mN
    final Z[] divisors = Jaguar.factor(++mN).divisorsSorted();
    if (mN > 1) {
      final int[] divs = new int[divisors.length - 1];
      for (int k = 0; k < divs.length; ++k) {
        divs[k] = divisors[k].intValueExact();
      }
      mDivisors.add(divs);
    }
    if (mPrime.isPrime(mN)) {
      // Special case for mN prime -- known result avoids excess computation
      mPrev = mPrev.subtract(mPrime.prevPrime(mN)).add(mN);
    } else {
      // General case
      final int total = mN * (mN + 1) / 2;
      mMinTaxman = total;
      final int[] taken = new int[mN + 1]; // entry 0 not used
      final int p = (int) mPrime.prevPrime(mN); // always take largest prime <= mN, first
      taken[p] = 1;
      taken[1] = 1;
      taken[0] = 1;
      search(taken, 1, 2, 2, mN);
      mPrev = Z.valueOf(total - mMinTaxman);
    }
    return mPrev;
  }
}
