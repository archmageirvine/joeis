package irvine.oeis.a072;

import irvine.math.function.Functions;
import irvine.oeis.FilterNumberSequence;

/**
 * A072142 Numbers k such that 14 applications of 'Reverse and Subtract' lead to k, whereas fewer than 14 applications do not lead to k.
 * @author Sean A. Irvine
 */
public class A072142 extends FilterNumberSequence {

  // This used to extend A072141 but that approach missed terms

  private static boolean is(final long n) {
    long t = n;
    for (long k = 0; k < 13; ++k) {
      t = Math.abs(t - Functions.REVERSE.l(t));
      if (t == n) {
        return false;
      }
    }
    return Math.abs(t - Functions.REVERSE.l(t)) == n;
  }

  /** Construct the sequence. */
  public A072142() {
    super(1, 11436678, A072142::is);
  }
}
