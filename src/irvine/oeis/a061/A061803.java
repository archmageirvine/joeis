package irvine.oeis.a061;

import irvine.oeis.LinearRecurrence;

/**
 * A061803.
 * @author Sean A. Irvine
 */
public class A061803 extends LinearRecurrence {

  /** Construct the sequence. */
  public A061803() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {1, 18, 115, 452, 1333, 3254});
  }
}
