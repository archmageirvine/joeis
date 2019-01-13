package irvine.oeis.a212;

import irvine.oeis.LinearRecurrence;

/**
 * A212683.
 * @author Sean A. Irvine
 */
public class A212683 extends LinearRecurrence {

  /** Construct the sequence. */
  public A212683() {
    super(new long[] {-1, 3, -2, -2, 3}, new long[] {0, 0, 2, 8, 22});
  }
}
