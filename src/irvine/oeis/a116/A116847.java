package irvine.oeis.a116;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A116847 Number of permutations of length n which avoid the patterns 123, 51432.
 * @author Sean A. Irvine
 */
public class A116847 extends LinearRecurrence {

  /** Construct the sequence. */
  public A116847() {
    super(1, new long[] {-1, 7, -19, 26, -19, 7}, new long[] {1, 2, 5, 14, 41, 119});
  }
}
