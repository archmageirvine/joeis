package irvine.oeis.a116;

import irvine.oeis.LinearRecurrence;

/**
 * A116819 Number of permutations of length n which avoid the patterns <code>2431, 4123, 4231</code>.
 * @author Sean A. Irvine
 */
public class A116819 extends LinearRecurrence {

  /** Construct the sequence. */
  public A116819() {
    super(new long[] {-3, 14, -16, 7}, new long[] {1, 2, 6, 21});
  }
}
