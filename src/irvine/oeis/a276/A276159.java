package irvine.oeis.a276;

import irvine.oeis.LinearRecurrence;

/**
 * A276159.
 * @author Sean A. Irvine
 */
public class A276159 extends LinearRecurrence {

  /** Construct the sequence. */
  public A276159() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {1, 16, 106, 416, 1211, 2912});
  }
}
