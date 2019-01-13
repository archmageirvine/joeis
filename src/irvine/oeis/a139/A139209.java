package irvine.oeis.a139;

import irvine.oeis.LinearRecurrence;

/**
 * A139209.
 * @author Sean A. Irvine
 */
public class A139209 extends LinearRecurrence {

  /** Construct the sequence. */
  public A139209() {
    super(new long[] {2, -7, 5}, new long[] {-1, -1, -1});
  }
}
