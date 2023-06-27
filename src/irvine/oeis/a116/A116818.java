package irvine.oeis.a116;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A116818 Number of permutations of length n which avoid the patterns 1234, 2341, 3421.
 * @author Sean A. Irvine
 */
public class A116818 extends LinearRecurrence {

  /** Construct the sequence. */
  public A116818() {
    super(1, new long[] {-1, 8, -28, 56, -70, 56, -28, 8}, new long[] {1, 2, 6, 21, 75, 248, 735, 1952});
  }
}
