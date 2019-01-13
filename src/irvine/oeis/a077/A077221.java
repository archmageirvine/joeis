package irvine.oeis.a077;

import irvine.oeis.LinearRecurrence;

/**
 * A077221.
 * @author Sean A. Irvine
 */
public class A077221 extends LinearRecurrence {

  /** Construct the sequence. */
  public A077221() {
    super(new long[] {1, -2, 0, 2}, new long[] {0, 1, 8, 17});
  }
}
