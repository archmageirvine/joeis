package irvine.oeis.a116;

import irvine.oeis.LinearRecurrence;

/**
 * A116730 Number of permutations of length n which avoid the patterns <code>321, 1342, 1423</code>.
 * @author Sean A. Irvine
 */
public class A116730 extends LinearRecurrence {

  /** Construct the sequence. */
  public A116730() {
    super(new long[] {1, -1, -2, 3}, new long[] {1, 2, 5, 12});
  }
}
