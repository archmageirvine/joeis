package irvine.oeis.a116;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A116736 Number of permutations of length n which avoid the patterns 1432, 2314, 2413.
 * @author Sean A. Irvine
 */
public class A116736 extends LinearRecurrence {

  /** Construct the sequence. */
  public A116736() {
    super(new long[] {1, -7, 18, -17, 7}, new long[] {1, 2, 6, 21, 75});
  }
}
