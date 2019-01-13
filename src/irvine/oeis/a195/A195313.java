package irvine.oeis.a195;

import irvine.oeis.LinearRecurrence;

/**
 * A195313.
 * @author Sean A. Irvine
 */
public class A195313 extends LinearRecurrence {

  /** Construct the sequence. */
  public A195313() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {0, 1, 10, 13, 31});
  }
}
