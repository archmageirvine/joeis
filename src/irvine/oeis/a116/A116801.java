package irvine.oeis.a116;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A116801 Number of permutations of length n which avoid the patterns 1234, 1432, 2413.
 * @author Sean A. Irvine
 */
public class A116801 extends LinearRecurrence {

  /** Construct the sequence. */
  public A116801() {
    super(new long[] {-1, 1, -4, 7, -19, 24, -18, 7}, new long[] {1, 2, 6, 21, 71, 229, 726, 2299});
  }
}
