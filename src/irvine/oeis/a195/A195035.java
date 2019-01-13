package irvine.oeis.a195;

import irvine.oeis.LinearRecurrence;

/**
 * A195035.
 * @author Sean A. Irvine
 */
public class A195035 extends LinearRecurrence {

  /** Construct the sequence. */
  public A195035() {
    super(new long[] {-1, 0, 2, 0}, new long[] {15, 8, 30, 16});
  }
}
