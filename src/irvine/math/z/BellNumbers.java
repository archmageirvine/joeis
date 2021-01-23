package irvine.math.z;

import java.util.ArrayList;

/**
 * Compute Bell numbers.
 * @author Sean A. Irvine
 */
public final class BellNumbers {

  private BellNumbers() { }

  private static final ArrayList<Z> BELL_NUMBERS = new ArrayList<>();

  static {
    BELL_NUMBERS.add(Z.ONE);
  }

  /**
   * Return the specified Bell number.
   * @param index number
   * @return Bell number
   */
  public static Z bell(final int index) {
    if (index < 0) {
      throw new UnsupportedOperationException();
    }
    while (BELL_NUMBERS.size() <= index) {
      Z sum = Z.ZERO;
      final int s = BELL_NUMBERS.size();
      for (int k = 0; k < s; ++k) {
        sum = sum.add(BELL_NUMBERS.get(k).multiply(Binomial.binomial(s - 1, k)));
      }
      BELL_NUMBERS.add(sum);
    }
    return BELL_NUMBERS.get(index);
  }

}
