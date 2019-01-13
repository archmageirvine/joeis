package irvine.oeis.a152;

import irvine.oeis.LinearRecurrence;

/**
 * A152965.
 * @author Sean A. Irvine
 */
public class A152965 extends LinearRecurrence {

  /** Construct the sequence. */
  public A152965() {
    super(new long[] {1, -3, 3}, new long[] {0, 2, 24});
  }
}
