package irvine.oeis.a152;

import irvine.oeis.LinearRecurrence;

/**
 * A152133.
 * @author Sean A. Irvine
 */
public class A152133 extends LinearRecurrence {

  /** Construct the sequence. */
  public A152133() {
    super(new long[] {-1, 3, -2, -2, 3}, new long[] {4, 16, 38, 78, 136});
  }
}
