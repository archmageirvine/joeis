package irvine.oeis.a163;

import irvine.oeis.LinearRecurrence;

/**
 * A163199.
 * @author Sean A. Irvine
 */
public class A163199 extends LinearRecurrence {

  /** Construct the sequence. */
  public A163199() {
    super(new long[] {1, -22, 77, -77, 22}, new long[] {-1, 0, 27, 539, 9800});
  }
}
