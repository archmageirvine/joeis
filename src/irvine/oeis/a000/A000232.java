package irvine.oeis.a000;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.array.DynamicLongArray;

import java.util.ArrayList;

/**
 * A000232 Construct a triangle as in <code>A036262</code>. Sequence is one less than the position of the first number larger than 2 in the n-th row <code>(n-th difference)</code>.
 * @author Sean A. Irvine
 */
public class A000232 implements Sequence {

  private int mN = 0;
  private long mP = 1;

  // Following table may be useful for A036262 and others
  // See http://mathworld.wolfram.com/GilbreathsConjecture.html
  // Array of arrays, zeroth row is primes, thereafter each row is the differences
  // between elements of the preceding row
  private final ArrayList<DynamicLongArray> mRows = new ArrayList<>();
  private final Fast mPrime = new Fast();

  private void extend() {
    mP = mPrime.nextPrime(mP);
    final DynamicLongArray primes = mRows.get(0);
    primes.set(primes.length(), mP);
    for (int k = 1; k < mRows.size(); ++k) {
      final DynamicLongArray source = mRows.get(k - 1);
      final DynamicLongArray dest = mRows.get(k);
      while (dest.length() < source.length() - 1) {
        dest.set(dest.length(), Math.abs(source.get(dest.length() + 1) - source.get(dest.length())));
      }
    }
  }

  private int a232(final int rowNumber) {
    while (rowNumber >= mRows.size()) {
      mRows.add(new DynamicLongArray());
    }
    final DynamicLongArray row = mRows.get(rowNumber);
    int c = 0;
    while (true) {
      while (c >= row.length()) {
        extend();
      }
      if (row.get(c) > 2) {
        return c;
      }
      ++c;
    }
  }

  @Override
  public Z next() {
    return Z.valueOf(a232(++mN));
  }
}

