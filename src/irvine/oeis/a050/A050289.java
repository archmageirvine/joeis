package irvine.oeis.a050;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.util.Permutation;

/**
 * A050289 Zeroless pandigital numbers: numbers containing the digits 1-9 (each appearing at least once) and no 0's.
 * @author Sean A. Irvine
 */
public class A050289 implements Sequence {

  // Uses a permutation approach with increasing numbers of (extra) digits.
  // At any time, there can be more than one Permutation engine in play, with
  // the overall order determined by a TreeSet containing the current value
  // from each underlying permutation.

  private static final int[] PANDIGITAL = {1, 2, 3, 4, 5, 6, 7, 8, 9};
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
        final Permutation perm = new Permutation(PANDIGITAL);
        mA.put(getValue(perm), perm);
      } else {
        // Construct all possible permutation generators with mExtraDigits 0..10^mExtraDigits.
        mLimit *= 10;
        for (long k = (mLimit - 1) / 9; k < mLimit; ++k) {
          if (!String.valueOf(k).contains("0")) {
            final int[] digits = Arrays.copyOf(PANDIGITAL, PANDIGITAL.length + mExtraDigits);
            long v = k;
            for (int j = 0; j < mExtraDigits; ++j) {
              digits[PANDIGITAL.length + j] = (int) (v % 10);
              v /= 10;
            }
            final Permutation perm = new Permutation(digits);
            mA.put(getValue(perm), perm);
          }
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

