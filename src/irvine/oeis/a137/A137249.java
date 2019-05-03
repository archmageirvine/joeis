package irvine.oeis.a137;

import irvine.oeis.LinearRecurrence;

/**
 * A137249 Transform of <code>A033999</code> by the <code>T_{0,1}</code> transformation <code>(see link)</code>.
 * @author Sean A. Irvine
 */
public class A137249 extends LinearRecurrence {

  /** Construct the sequence. */
  public A137249() {
    super(new long[] {1, -1, 1, 2}, new long[] {2, 2, 7, 15});
  }
}
