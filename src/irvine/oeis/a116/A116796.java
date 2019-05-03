package irvine.oeis.a116;

import irvine.oeis.LinearRecurrence;

/**
 * A116796 Number of permutations of length n which avoid the patterns <code>2314, 3241, 4132</code>.
 * @author Sean A. Irvine
 */
public class A116796 extends LinearRecurrence {

  /** Construct the sequence. */
  public A116796() {
    super(new long[] {1, -7, 17, -17, 7}, new long[] {1, 2, 6, 21, 72});
  }
}
