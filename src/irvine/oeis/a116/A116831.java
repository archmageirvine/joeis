package irvine.oeis.a116;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A116831 Number of permutations of length n which avoid the patterns 3124, 3241, 4321.
 * @author Sean A. Irvine
 */
public class A116831 extends LinearRecurrence {

  /** Construct the sequence. */
  public A116831() {
    super(1, new long[] {2, -15, 53, -115, 166, -162, 105, -43, 10}, new long[] {1, 2, 6, 21, 74, 247, 769, 2247, 6238});
  }
}
