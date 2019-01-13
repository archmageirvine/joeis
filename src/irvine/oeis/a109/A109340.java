package irvine.oeis.a109;

import irvine.oeis.LinearRecurrence;

/**
 * A109340.
 * @author Sean A. Irvine
 */
public class A109340 extends LinearRecurrence {

  /** Construct the sequence. */
  public A109340() {
    super(new long[] {1, -2, 1, -1, 2}, new long[] {0, 0, 1, 3, 9});
  }
}
