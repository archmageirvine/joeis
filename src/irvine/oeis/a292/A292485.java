package irvine.oeis.a292;

import irvine.oeis.LinearRecurrence;

/**
 * A292485.
 * @author Sean A. Irvine
 */
public class A292485 extends LinearRecurrence {

  /** Construct the sequence. */
  public A292485() {
    super(new long[] {2, 7, -5, 5}, new long[] {1, 6, 28, 120});
  }
}
