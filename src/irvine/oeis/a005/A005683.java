package irvine.oeis.a005;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A005683 Numbers of Twopins positions.
 * @author Sean A. Irvine
 */
public class A005683 extends LinearRecurrence {

  /** Construct the sequence. */
  public A005683() {
    super(new long[] {-1, 0, -1, 0, 0, 2}, new long[] {1, 2, 3, 5, 8, 13});
  }
}
