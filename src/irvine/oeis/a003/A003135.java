package irvine.oeis.a003;

import irvine.factor.factor.Cheetah;
import irvine.factor.prime.Fast;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.array.DynamicIntArray;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * A003135 <code>n!</code> is a nontrivial product of factorials. It is conjectured that the list is complete.
 * @author Sean A. Irvine
 */
public class A003135 implements Sequence {

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));
  private final DynamicIntArray mPrimeToIndex = new DynamicIntArray();
  private final DynamicIntArray mIndexToPrime = new DynamicIntArray();
  private int mNextUnusedIndex = 0;
  private final Fast mPrime = new Fast();
  private final ArrayList<int[]> mExponentVectors = new ArrayList<>();
  {
    mExponentVectors.add(new int[0]); // 0!
    mExponentVectors.add(new int[0]); // 1!
  }
  private int mN = 1;

  private boolean solve(final int[] exponents, final int top, final int maxN) {
    if (top == -1) {
      // All zero means we found a nontrivial solution
      return true;
    }
    final int minN = mIndexToPrime.get(top);
    for (int k = maxN; k >= minN; --k) {
      final int[] v = mExponentVectors.get(k);
      if (v.length > top + 1) {
        continue;
      }
      // To avoid churn, first check that no exponent will go negative
      boolean ok = true;
      for (int j = 0; j < v.length; ++j) {
        if (exponents[j] - v[j] < 0) {
          ok = false;
          break;
        }
      }
      if (ok) {
        // Make a copy with reduced exponents, shortening the array if possible
        int i = top;
        while (i >= 0 && exponents[i] - v[i] == 0) {
          --i;
        }
        final int newTop = i;
        while (i >= 0) {
          exponents[i] -= v[i];
          --i;
        }
        if (solve(exponents, newTop, k)) {
          return true;
        }
        // Restore exponents
        for (int j = 0; j < v.length; ++j) {
          exponents[j] += v[j];
        }
      }
    }
    return false;
  }

  @Override
  public Z next() {
    while (true) {
      ++mN;
      final int[] exponents;
      if (mPrime.isPrime(mN)) {
        // New prime, update the prime index
        mPrimeToIndex.set(mN, mNextUnusedIndex);
        mIndexToPrime.set(mNextUnusedIndex, mN);
        ++mNextUnusedIndex;
        exponents = Arrays.copyOf(mExponentVectors.get(mN - 1), mNextUnusedIndex);
        exponents[exponents.length - 1] = 1;
      } else {
        // Otherwise factor mN, all factors will be less than current prime limit
        exponents = Arrays.copyOf(mExponentVectors.get(mN - 1), mNextUnusedIndex);
        final FactorSequence fs = Cheetah.factor(mN);
        for (final Z pp : fs.toZArray()) {
          final int p = pp.intValueExact();
          final int k = mPrimeToIndex.get(p);
          exponents[k] += fs.getExponent(pp);
        }
      }
      mExponentVectors.add(exponents);
      final int[] copy = Arrays.copyOf(exponents, exponents.length);
      if (mVerbose && mN % 1000 == 0) {
        System.out.println("Searched to " + mN);
      }
      if (solve(copy, copy.length - 1, mN - 2)) {
        return Z.valueOf(mN);
      }
    }
  }
}

