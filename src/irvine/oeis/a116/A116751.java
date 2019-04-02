package irvine.oeis.a116;

import irvine.oeis.LinearRecurrence;

/**
 * A116751 Number of permutations of length n which avoid the patterns 2314, 2431, 3124.
 * @author Sean A. Irvine
 */
public class A116751 extends LinearRecurrence {

  /** Construct the sequence. */
  public A116751() {
    super(new long[] {1, -6, 13, -12, 6}, new long[] {1, 2, 6, 21, 75});
  }
}
