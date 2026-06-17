package irvine.oeis.a173;

import irvine.oeis.FilterNumberSequence;

/**
 * A173024 Numbers having neither isolated ones nor isolated double ones in their binary representations.
 * @author Sean A. Irvine
 */
public class A173024 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A173024() {
    super(1, 0, k -> {
      if (k == 0) {
        return true;
      }
      if ((k & 3) == 1 || (k & 7) == 3) {
        return false;
      }
      for (long m = 0b111, r = 0b010; m <= 4 * k; m <<= 1, r <<= 1) {
        if ((m & k) == r) {
          return false;
        }
      }
      for (long m = 0b1111, r = 0b0110; m <= 8 * k; m <<= 1, r <<= 1) {
        if ((m & k) == r) {
          return false;
        }
      }
      return true;
    });
  }
}
