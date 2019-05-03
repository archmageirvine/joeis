package irvine.oeis.a137;

import irvine.oeis.LinearRecurrence;

/**
 * A137229 Transform of <code>A000217</code> without the initial 0 by the <code>T_{0,0}</code> transformation <code>(see link)</code>.
 * @author Sean A. Irvine
 */
public class A137229 extends LinearRecurrence {

  /** Construct the sequence. */
  public A137229() {
    super(new long[] {-1, 3, -5, 4}, new long[] {1, 4, 11, 27});
  }
}
