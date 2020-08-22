package irvine.oeis.a116;

import irvine.oeis.LinearRecurrence;

/**
 * A116769 Number of permutations of length n which avoid the patterns 1234, 4123, 4132.
 * @author Sean A. Irvine
 */
public class A116769 extends LinearRecurrence {

  /** Construct the sequence. */
  public A116769() {
    super(new long[] {-4, 28, -85, 146, -155, 104, -43, 10}, new long[] {1, 2, 6, 21, 76, 263, 843, 2501});
  }
}
