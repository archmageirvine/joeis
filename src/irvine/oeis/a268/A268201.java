package irvine.oeis.a268;

import irvine.oeis.LinearRecurrence;

/**
 * A268201.
 * @author Sean A. Irvine
 */
public class A268201 extends LinearRecurrence {

  /** Construct the sequence. */
  public A268201() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, 13, 62, 171});
  }
}
