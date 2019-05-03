package irvine.oeis.a159;

import irvine.oeis.LinearRecurrence;

/**
 * A159343 Transform of <code>A056594</code> by the <code>T_{0,1}</code> transformation <code>(see link)</code>.
 * @author Sean A. Irvine
 */
public class A159343 extends LinearRecurrence {

  /** Construct the sequence. */
  public A159343() {
    super(new long[] {1, -2, 4, -3, 3}, new long[] {2, 3, 6, 16, 39});
  }
}
