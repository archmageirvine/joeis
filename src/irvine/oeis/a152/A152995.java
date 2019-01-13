package irvine.oeis.a152;

import irvine.oeis.LinearRecurrence;

/**
 * A152995.
 * @author Sean A. Irvine
 */
public class A152995 extends LinearRecurrence {

  /** Construct the sequence. */
  public A152995() {
    super(new long[] {1, -3, 3}, new long[] {0, 2, 22});
  }
}
