package irvine.oeis.a116;

import irvine.oeis.LinearRecurrence;

/**
 * A116780 Number of permutations of length n which avoid the patterns <code>2341, 4123, 4132</code>.
 * @author Sean A. Irvine
 */
public class A116780 extends LinearRecurrence {

  /** Construct the sequence. */
  public A116780() {
    super(new long[] {-2, 8, -19, 27, -19, 7}, new long[] {1, 2, 6, 21, 74, 249});
  }
}
