package irvine.oeis.a258;

import irvine.oeis.LinearRecurrence;

/**
 * A258133 Expansion of tri-digit zeros interlaced with an arithmetic progression of positive and negative numbers.
 * @author Sean A. Irvine
 */
public class A258133 extends LinearRecurrence {

  /** Construct the sequence. */
  public A258133() {
    super(new long[] {-1, -1, 0, 1, 1, 0, 1, 1, 0, -1}, new long[] {1, 0, 0, 0, 2, -2, 2, 0, 0, 0});
  }
}
