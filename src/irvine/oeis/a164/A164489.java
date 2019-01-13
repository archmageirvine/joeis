package irvine.oeis.a164;

import irvine.oeis.LinearRecurrence;

/**
 * A164489.
 * @author Sean A. Irvine
 */
public class A164489 extends LinearRecurrence {

  /** Construct the sequence. */
  public A164489() {
    super(new long[] {-1, 1, 1, -1, -1, 0, 2}, new long[] {13, 20, 30, 45, 68, 103, 156});
  }
}
