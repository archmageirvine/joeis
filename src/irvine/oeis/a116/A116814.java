package irvine.oeis.a116;

import irvine.oeis.LinearRecurrence;

/**
 * A116814 Number of permutations of length n which avoid the patterns <code>3124, 3421, 4231</code>.
 * @author Sean A. Irvine
 */
public class A116814 extends LinearRecurrence {

  /** Construct the sequence. */
  public A116814() {
    super(new long[] {4, -40, 165, -369, 496, -418, 222, -72, 13}, new long[] {1, 2, 6, 21, 75, 258, 845, 2649, 8019});
  }
}
