package irvine.oeis.a116;

import irvine.oeis.LinearRecurrence;

/**
 * A116851 Number of permutations of length n which avoid the patterns <code>321, 31245</code>.
 * @author Sean A. Irvine
 */
public class A116851 extends LinearRecurrence {

  /** Construct the sequence. */
  public A116851() {
    super(new long[] {-2, 11, -25, 30, -20, 7}, new long[] {1, 2, 5, 14, 41, 116});
  }
}
