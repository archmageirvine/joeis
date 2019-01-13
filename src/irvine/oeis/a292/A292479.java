package irvine.oeis.a292;

import irvine.oeis.LinearRecurrence;

/**
 * A292479.
 * @author Sean A. Irvine
 */
public class A292479 extends LinearRecurrence {

  /** Construct the sequence. */
  public A292479() {
    super(new long[] {-1, 6, -14, 22, -14, 6}, new long[] {0, 1, 8, 35, 120, 392});
  }
}
