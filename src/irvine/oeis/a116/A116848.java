package irvine.oeis.a116;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A116848 Number of permutations of length n which avoid the patterns 231, 51234.
 * @author Sean A. Irvine
 */
public class A116848 extends LinearRecurrence {

  /** Construct the sequence. */
  public A116848() {
    super(1, new long[] {4, -10, 17, -14, 6}, new long[] {1, 2, 5, 14, 41});
  }
}
