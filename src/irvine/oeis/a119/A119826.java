package irvine.oeis.a119;

import irvine.oeis.LinearRecurrence;

/**
 * A119826 Number of ternary words of length n with no <code>000</code>'s.
 * @author Sean A. Irvine
 */
public class A119826 extends LinearRecurrence {

  /** Construct the sequence. */
  public A119826() {
    super(new long[] {2, 2, 2}, new long[] {1, 3, 9});
  }
}
