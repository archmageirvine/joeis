package irvine.oeis.a116;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A116743 Number of permutations of length n which avoid the patterns 3421, 4123, 4213.
 * @author Sean A. Irvine
 */
public class A116743 extends LinearRecurrence {

  /** Construct the sequence. */
  public A116743() {
    super(1, new long[] {-1, 6, -16, 21, -17, 7}, new long[] {1, 2, 6, 21, 75, 267});
  }
}
