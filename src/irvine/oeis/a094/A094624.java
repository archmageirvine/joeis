package irvine.oeis.a094;

import irvine.oeis.LinearRecurrence;

/**
 * A094624 Sequence whose n-th term digits sum to <code>n</code>.
 * @author Sean A. Irvine
 */
public class A094624 extends LinearRecurrence {

  /** Construct the sequence. */
  public A094624() {
    super(new long[] {-10, 0, 11, 0}, new long[] {0, 1, 11, 12});
  }
}
