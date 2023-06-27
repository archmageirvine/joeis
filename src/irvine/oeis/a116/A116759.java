package irvine.oeis.a116;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A116759 Number of permutations of length n which avoid the patterns 2134, 3421, 4123.
 * @author Sean A. Irvine
 */
public class A116759 extends LinearRecurrence {

  /** Construct the sequence. */
  public A116759() {
    super(1, new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {1, 2, 6, 21, 71, 209, 533});
  }
}
