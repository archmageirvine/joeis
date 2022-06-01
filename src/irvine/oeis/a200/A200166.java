package irvine.oeis.a200;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A200166 Number of -n..n arrays x(0..2) of 3 elements with nonzero sum and with zero through 2 differences all nonzero.
 * @author Sean A. Irvine
 */
public class A200166 extends LinearRecurrence {

  // WARNING Conjectural formula: do not use this implementation to extend the sequence.

  /** Construct the sequence. */
  public A200166() {
    super(new long[] {-1, 3, -2, -2, 3}, new long[] {2, 34, 128, 348, 726});
  }
}
