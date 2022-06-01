package irvine.oeis.a116;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A116844 Number of permutations of length n which avoid the patterns 231, 12345.
 * @author Sean A. Irvine
 */
public class A116844 extends LinearRecurrence {

  /** Construct the sequence. */
  public A116844() {
    super(new long[] {1, -7, 21, -35, 35, -21, 7}, new long[] {1, 1, 2, 5, 14, 41, 116});
  }
}
