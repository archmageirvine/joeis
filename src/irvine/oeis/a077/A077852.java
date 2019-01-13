package irvine.oeis.a077;

import irvine.oeis.LinearRecurrence;

/**
 * A077852.
 * @author Sean A. Irvine
 */
public class A077852 extends LinearRecurrence {

  /** Construct the sequence. */
  public A077852() {
    super(new long[] {-1, 1, -2, 3}, new long[] {1, 3, 7, 16});
  }
}
