package irvine.oeis.a116;

import irvine.oeis.LinearRecurrence;

/**
 * A116760 Number of permutations of length n which avoid the patterns 2341, 3214, 4213; or avoid the patterns 1324, 2341, 3214.
 * @author Sean A. Irvine
 */
public class A116760 extends LinearRecurrence {

  /** Construct the sequence. */
  public A116760() {
    super(new long[] {2, -13, 28, -23, 8}, new long[] {1, 2, 6, 21, 73});
  }
}
