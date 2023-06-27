package irvine.oeis.a116;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A116833 Number of permutations of length n which avoid the patterns 2134, 3421, 4132.
 * @author Sean A. Irvine
 */
public class A116833 extends LinearRecurrence {

  /** Construct the sequence. */
  public A116833() {
    super(1, new long[] {-1, 8, -28, 56, -70, 56, -28, 8}, new long[] {1, 2, 6, 21, 71, 213, 564, 1340});
  }
}
