package irvine.oeis.a116;

import irvine.oeis.LinearRecurrence;

/**
 * A116795 Number of permutations of length n which avoid the patterns <code>2341, 3214, 4123</code>.
 * @author Sean A. Irvine
 */
public class A116795 extends LinearRecurrence {

  /** Construct the sequence. */
  public A116795() {
    super(new long[] {1, -7, 18, -20, 4, 19, -37, 40, -25, 8}, new long[] {1, 2, 6, 21, 70, 212, 611, 1712, 4712, 12815});
  }
}
