package irvine.oeis.a116;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A116781 Number of permutations of length n which avoid the patterns 1234, 1243, 3214.
 * @author Sean A. Irvine
 */
public class A116781 extends LinearRecurrence {

  /** Construct the sequence. */
  public A116781() {
    super(1, new long[] {-2, 0, 2, 1, 3}, new long[] {1, 2, 6, 21, 73});
  }
}
