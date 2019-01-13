package irvine.oeis.a245;

import irvine.oeis.LinearRecurrence;

/**
 * A245032.
 * @author Sean A. Irvine
 */
public class A245032 extends LinearRecurrence {

  /** Construct the sequence. */
  public A245032() {
    super(new long[] {-1, 4, -6, 4}, new long[] {108, 175, 176, 135});
  }
}
