package irvine.oeis.a152;

import irvine.oeis.LinearRecurrence;

/**
 * A152741 13 times triangular numbers.
 * @author Sean A. Irvine
 */
public class A152741 extends LinearRecurrence {

  /** Construct the sequence. */
  public A152741() {
    super(new long[] {1, -3, 3}, new long[] {0, 13, 39});
  }
}
