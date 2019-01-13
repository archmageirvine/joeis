package irvine.oeis.a115;

import irvine.oeis.LinearRecurrence;

/**
 * A115714.
 * @author Sean A. Irvine
 */
public class A115714 extends LinearRecurrence {

  /** Construct the sequence. */
  public A115714() {
    super(new long[] {1, 1, 1, 0, -1, -1}, new long[] {1, -1, -3, 0, 1, -5});
  }
}
