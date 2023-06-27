package irvine.oeis.a293;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A293481 Numbers with last digit greater than or equal to 5 (in base 10).
 * @author Sean A. Irvine
 */
public class A293481 extends LinearRecurrence {

  /** Construct the sequence. */
  public A293481() {
    super(1, new long[] {-1, 1, 0, 0, 0, 1}, new long[] {5, 6, 7, 8, 9, 15});
  }
}
