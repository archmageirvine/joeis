package irvine.oeis.a268;

import irvine.oeis.LinearRecurrence;

/**
 * A268644.
 * @author Sean A. Irvine
 */
public class A268644 extends LinearRecurrence {

  /** Construct the sequence. */
  public A268644() {
    super(new long[] {-1, 4, -6, 4}, new long[] {-1, -2, 15, 74});
  }
}
