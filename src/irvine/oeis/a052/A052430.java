package irvine.oeis.a052;

import java.util.Arrays;
import java.util.TreeSet;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.Permutation;

/**
 * A052430 Numbers n such that sum of digits and product of digits are both prime.
 * @author Sean A. Irvine
 */
public class A052430 extends Sequence1 {

  // Only digits 1-9 can occur, only 1 digit not equal to 1 can occur
  // Any permutation of a value in the sequence is also in the sequence.

  private final Fast mPrime = new Fast();
  private final TreeSet<Z> mA = new TreeSet<>();
  private int mDigits = 0;

  @Override
  public Z next() {
    while (mA.isEmpty()) {
      ++mDigits;
      for (int d = 2; d <= 7; ++d) {
        if (mPrime.isPrime(d) && mPrime.isPrime(d + mDigits - 1)) {
          final int[] digits = new int[mDigits];
          Arrays.fill(digits, 1);
          digits[digits.length - 1] = d;
          final Permutation perm = new Permutation(digits);
          int[] p;
          while ((p = perm.next()) != null) {
            Z t = Z.ZERO;
            for (final int v : p) {
              t = t.multiply(10).add(v);
            }
            mA.add(t);
          }
        }
      }
    }
    return mA.pollFirst();
  }
}
