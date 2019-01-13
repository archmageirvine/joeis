package irvine.oeis.a115;

import irvine.oeis.LinearRecurrence;

/**
 * A115635.
 * @author Sean A. Irvine
 */
public class A115635 extends LinearRecurrence {

  /** Construct the sequence. */
  public A115635() {
    super(new long[] {1, 1, 1, 0, -1, -1}, new long[] {1, 1, -5, 0, 1, -3});
  }
}
