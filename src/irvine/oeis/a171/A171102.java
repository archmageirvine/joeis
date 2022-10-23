package irvine.oeis.a171;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.Permutation;

/**
 * A171102 Pandigital numbers: numbers containing the digits 0-9. Version 2: each digit appears at least once.
 * @author Sean A. Irvine
 */
public class A171102 extends Sequence1 {

  // Uses a permutation approach with increasing numbers of (extra) digits.
  // At any time, there can be more than one Permutation engine in play, with
  // the overall order determined by a TreeSet containing the current value
  // from each underlying permutation.

  private static final int[] PANDIGITAL = {1, 0, 2, 3, 4, 5, 6, 7, 8, 9};
  protected final TreeMap<Long, Permutation> mA = new TreeMap<>();
  private int mExtraDigits = -1;
  private long mLimit = 1;

  private Long getValue(final Permutation perm) {
    final int[] p = perm.next();
    if (p == null) {
      return null;
    }
    long prod = 0;
    for (final int v : p) {
      prod *= 10;
      prod += v;
    }
    return prod;
  }

  @Override
  public Z next() {
    if (mA.isEmpty()) {
      // Step to next length of digits
      if (++mExtraDigits == 0) {
        final Permutation perm = new Permutation(PANDIGITAL, false);
        mA.put(getValue(perm), perm);
      } else {
        // Construct all possible permutation generators with mExtraDigits 0..10^mExtraDigits.
        mLimit *= 10;
        for (long k = 0; k < mLimit; ++k) {
          final int[] digits = Arrays.copyOf(PANDIGITAL, PANDIGITAL.length + mExtraDigits);
          long v = k;
          for (int j = 0; j < mExtraDigits; ++j) {
            digits[PANDIGITAL.length + j] = (int) (v % 10);
            v /= 10;
          }
          Arrays.sort(digits);
          int j = 0;
          while (digits[++j] == 0) {
            // do nothing
          }
          digits[0] = digits[j];
          digits[j] = 0;
          final Permutation perm = new Permutation(digits, false);
          mA.put(getValue(perm), perm);
        }
      }
    }
    final Map.Entry<Long, Permutation> e = mA.pollFirstEntry();
    final Long next = getValue(e.getValue());
    if (next != null) {
      mA.put(next, e.getValue());
    }
    return Z.valueOf(e.getKey());
  }
}

