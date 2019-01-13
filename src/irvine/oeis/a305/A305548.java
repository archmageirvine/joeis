package irvine.oeis.a305;

import irvine.oeis.LinearRecurrence;

/**
 * A305548.
 * @author Sean A. Irvine
 */
public class A305548 extends LinearRecurrence {

  /** Construct the sequence. */
  public A305548() {
    super(new long[] {-1, 2}, new long[] {0, 27});
  }
}
