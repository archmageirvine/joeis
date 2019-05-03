package irvine.oeis.a159;

import irvine.oeis.LinearRecurrence;

/**
 * A159339 Transform of <code>A056594</code> by the <code>T_{1,0}</code> transformation <code>(see link)</code>.
 * @author Sean A. Irvine
 */
public class A159339 extends LinearRecurrence {

  /** Construct the sequence. */
  public A159339() {
    super(new long[] {1, -2, 4, -3, 3}, new long[] {1, 2, 4, 11, 27});
  }
}
