package irvine.oeis.a228;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A228406 Sequences from the quartic oscillator.
 * @author Sean A. Irvine
 */
public class A228406 extends LinearRecurrence {

  /** Construct the sequence. */
  public A228406() {
    super(new long[] {-1, 6, -15, 20, -15, 6}, new long[] {0, 24, 384, 2064, 7104, 18984});
  }
}
