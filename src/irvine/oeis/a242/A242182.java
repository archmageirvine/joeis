package irvine.oeis.a242;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A242182 Numbers with four C's in Roman numerals.
 * @author Sean A. Irvine
 */
public class A242182 extends LinearRecurrence {

  /** Construct the sequence. */
  public A242182() {
    super(1, new long[] {-1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 1}, new long[] {390, 391, 392, 393, 394, 395, 396, 397, 398, 399, 890});
  }
}
