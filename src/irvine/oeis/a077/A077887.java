package irvine.oeis.a077;

import irvine.oeis.LinearRecurrence;

/**
 * A077887.
 * @author Sean A. Irvine
 */
public class A077887 extends LinearRecurrence {

  /** Construct the sequence. */
  public A077887() {
    super(new long[] {-2, 3, -1, 1}, new long[] {1, 1, 0, 2});
  }
}
