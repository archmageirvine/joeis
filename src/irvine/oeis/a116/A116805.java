package irvine.oeis.a116;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A116805 Number of permutations of length n which avoid the patterns 2134, 3214, 4123.
 * @author Sean A. Irvine
 */
public class A116805 extends LinearRecurrence {

  /** Construct the sequence. */
  public A116805() {
    super(1, new long[] {-2, 12, -29, 36, -24, 8}, new long[] {1, 2, 6, 21, 74, 256});
  }
}
