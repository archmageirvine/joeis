package irvine.oeis.a116;

import irvine.oeis.LinearRecurrence;

/**
 * A116738 Number of permutations of length n which avoid the patterns 3214, 4123, 4132.
 * @author Sean A. Irvine
 */
public class A116738 extends LinearRecurrence {

  /** Construct the sequence. */
  public A116738() {
    super(new long[] {1, -2, 4}, new long[] {1, 2, 6});
  }
}
