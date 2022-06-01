package irvine.oeis.a115;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A115525 Periodic {1,1,-2,0,1,0,-1,0,0,1,-1,-1}.
 * @author Sean A. Irvine
 */
public class A115525 extends LinearRecurrence {

  /** Construct the sequence. */
  public A115525() {
    super(new long[] {1, 1, 1, 0, -1, -1}, new long[] {1, 1, -2, 0, 1, 0});
  }
}
