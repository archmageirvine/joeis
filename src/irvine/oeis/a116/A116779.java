package irvine.oeis.a116;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A116779 Number of permutations of length n which avoid the patterns 2143, 2341, 3214.
 * @author Sean A. Irvine
 */
public class A116779 extends LinearRecurrence {

  /** Construct the sequence. */
  public A116779() {
    super(new long[] {1, -5, 11, -12, 6}, new long[] {1, 2, 6, 21, 72});
  }
}
