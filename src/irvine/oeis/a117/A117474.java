package irvine.oeis.a117;

import irvine.oeis.LinearRecurrence;

/**
 * A117474.
 * @author Sean A. Irvine
 */
public class A117474 extends LinearRecurrence {

  /** Construct the sequence. */
  public A117474() {
    super(new long[] {1, -1, -6, 6, 1}, new long[] {5, 8, 48, 65, 297});
  }
}
