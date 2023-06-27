package irvine.oeis.a116;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A116716 Number of permutations of length n which avoid the patterns 321, 2341, 4123.
 * @author Sean A. Irvine
 */
public class A116716 extends LinearRecurrence {

  /** Construct the sequence. */
  public A116716() {
    super(1, new long[] {-1, 1, 1, 0, 2}, new long[] {1, 2, 5, 12, 26});
  }
}
