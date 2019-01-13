package irvine.oeis.a168;

import irvine.oeis.LinearRecurrence;

/**
 * A168489.
 * @author Sean A. Irvine
 */
public class A168489 extends LinearRecurrence {

  /** Construct the sequence. */
  public A168489() {
    super(new long[] {-1, 1, 1}, new long[] {7, 11, 19});
  }
}
