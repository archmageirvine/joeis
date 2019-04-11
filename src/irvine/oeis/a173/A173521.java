package irvine.oeis.a173;

import irvine.oeis.LinearRecurrence;

/**
 * A173521 <code>a(n)</code> is the concatenation of n 1's, <code>0, n</code> 1's and 0.
 * @author Sean A. Irvine
 */
public class A173521 extends LinearRecurrence {

  /** Construct the sequence. */
  public A173521() {
    super(new long[] {1000, -1110, 111}, new long[] {0, 1010, 110110});
  }
}
