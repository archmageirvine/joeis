package irvine.oeis.a139;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A139612 66n + 12.
 * @author Sean A. Irvine
 */
public class A139612 extends LinearRecurrence {

  /** Construct the sequence. */
  public A139612() {
    super(new long[] {-1, 2}, new long[] {12, 78});
  }
}
