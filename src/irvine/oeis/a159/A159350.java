package irvine.oeis.a159;

import irvine.oeis.LinearRecurrence;

/**
 * A159350 Transform of <code>A056594</code> by the <code>T_{0,0}</code> transformation <code>(see link)</code>.
 * @author Sean A. Irvine
 */
public class A159350 extends LinearRecurrence {

  /** Construct the sequence. */
  public A159350() {
    super(new long[] {1, -2, 4, -3, 3}, new long[] {1, 1, 1, 4, 11});
  }
}
