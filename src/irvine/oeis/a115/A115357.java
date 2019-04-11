package irvine.oeis.a115;

import irvine.oeis.LinearRecurrence;

/**
 * A115357 Periodic <code>{1,1,1,0,2,0}</code>.
 * @author Sean A. Irvine
 */
public class A115357 extends LinearRecurrence {

  /** Construct the sequence. */
  public A115357() {
    super(new long[] {1, 1, 0, -1}, new long[] {1, 1, 1, 0});
  }
}
