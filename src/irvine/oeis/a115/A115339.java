package irvine.oeis.a115;

import irvine.oeis.LinearRecurrence;

/**
 * A115339.
 * @author Sean A. Irvine
 */
public class A115339 extends LinearRecurrence {

  /** Construct the sequence. */
  public A115339() {
    super(new long[] {1, 0, 1, 0}, new long[] {1, 1, 2, 3});
  }
}
