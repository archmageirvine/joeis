package irvine.oeis.a152;

import irvine.oeis.LinearRecurrence;

/**
 * A152269.
 * @author Sean A. Irvine
 */
public class A152269 extends LinearRecurrence {

  /** Construct the sequence. */
  public A152269() {
    super(new long[] {32, 0, -5, 0}, new long[] {0, 1, -3, -13});
  }
}
