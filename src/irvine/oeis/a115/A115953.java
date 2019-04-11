package irvine.oeis.a115;

import irvine.oeis.LinearRecurrence;

/**
 * A115953 Periodic <code>{1,-1,0,0,1,-2,1,0,0,-1,1,-1}</code>.
 * @author Sean A. Irvine
 */
public class A115953 extends LinearRecurrence {

  /** Construct the sequence. */
  public A115953() {
    super(new long[] {1, 1, 1, 0, -1, -1}, new long[] {1, -1, 0, 0, 1, -2});
  }
}
