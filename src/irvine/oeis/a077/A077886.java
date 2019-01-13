package irvine.oeis.a077;

import irvine.oeis.LinearRecurrence;

/**
 * A077886.
 * @author Sean A. Irvine
 */
public class A077886 extends LinearRecurrence {

  /** Construct the sequence. */
  public A077886() {
    super(new long[] {2, -2, 0, 1}, new long[] {1, 1, 1, -1});
  }
}
