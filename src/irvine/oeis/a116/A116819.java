package irvine.oeis.a116;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A116819 Number of permutations of length n which avoid the patterns 2431, 4123, 4231.
 * @author Sean A. Irvine
 */
public class A116819 extends LinearRecurrence {

  /** Construct the sequence. */
  public A116819() {
    super(1, new long[] {-3, 14, -16, 7}, new long[] {1, 2, 6, 21});
  }
}
