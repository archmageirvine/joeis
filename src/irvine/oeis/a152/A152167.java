package irvine.oeis.a152;

import irvine.oeis.LinearRecurrence;

/**
 * A152167.
 * @author Sean A. Irvine
 */
public class A152167 extends LinearRecurrence {

  /** Construct the sequence. */
  public A152167() {
    super(new long[] {3, -1}, new long[] {1, -3});
  }
}
