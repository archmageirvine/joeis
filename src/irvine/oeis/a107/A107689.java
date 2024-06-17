package irvine.oeis.a107;

import java.util.Arrays;
import java.util.TreeSet;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.string.StringUtils;

/**
 * A107689 Primes with digital product = 3.
 * @author Georg Fischer
 * @author Sean A. Irvine
 */
public class A107689 extends Sequence1 {

  private final TreeSet<Z> mA = new TreeSet<>();
  private final int[] mDigits;
  private int mNumberOfOnes = -1;

  /** Construct the sequence. */
  public A107689() {
    this(3);
  }

  /**
   * Generic constructor with parameter.
   * @param digits extra digits to appear in primes
   */
  public A107689(final int... digits) {
    mDigits = Arrays.copyOf(digits, digits.length);
  }

  private boolean bump(final int[] pos, final int max) {
    for (int k = 0; k < pos.length; ++k) {
      if (++pos[k] <= max + k) {
        return true;
      }
      pos[k] = 0;
    }
    return false;
  }


  @Override
  public Z next() {
    while (mA.isEmpty()) {
      ++mNumberOfOnes;
      final int[] pos = new int[mDigits.length];
      do {
        String rep = StringUtils.rep('1', mNumberOfOnes);
        for (int k = 0; k < mDigits.length; ++k) {
          rep = rep.substring(0, pos[k]) + mDigits[k] + rep.substring(pos[k]);
        }
        final Z candidate = new Z(rep);
        if (candidate.isProbablePrime()) {
          mA.add(candidate);
        }
      } while (bump(pos, mNumberOfOnes));
    }
    return mA.pollFirst();
  }
}
