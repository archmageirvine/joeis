package irvine.oeis.a191;

import irvine.oeis.LinearRecurrence;

/**
 * A191761.
 * @author Sean A. Irvine
 */
public class A191761 extends LinearRecurrence {

  /** Construct the sequence. */
  public A191761() {
    super(new long[] {1, 0, 0, 0, 0}, new long[] {0, 4, 6, 6, 4});
  }
}
