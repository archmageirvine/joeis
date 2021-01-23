package irvine.oeis.a116;

import irvine.oeis.LinearRecurrence;

/**
 * A116787 Number of permutations of length n which avoid the patterns 1432, 2314, 3124.
 * @author Sean A. Irvine
 */
public class A116787 extends LinearRecurrence {

  /** Construct the sequence. */
  public A116787() {
    super(new long[] {-1, 2, -6, 4, 7, -32, 40, -25, 8}, new long[] {1, 2, 6, 21, 73, 240, 759, 2365, 7369});
  }
}
