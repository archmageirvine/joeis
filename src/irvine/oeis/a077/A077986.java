package irvine.oeis.a077;

import irvine.oeis.LinearRecurrence;

/**
 * A077986.
 * @author Sean A. Irvine
 */
public class A077986 extends LinearRecurrence {

  /** Construct the sequence. */
  public A077986() {
    super(new long[] {-1, 1, -2}, new long[] {1, -2, 5});
  }
}
