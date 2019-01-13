package irvine.oeis.a077;

import irvine.oeis.LinearRecurrence;

/**
 * A077990.
 * @author Sean A. Irvine
 */
public class A077990 extends LinearRecurrence {

  /** Construct the sequence. */
  public A077990() {
    super(new long[] {1, -1, -2}, new long[] {1, -2, 3});
  }
}
