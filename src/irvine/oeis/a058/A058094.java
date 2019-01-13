package irvine.oeis.a058;

import irvine.oeis.LinearRecurrence;

/**
 * A058094.
 * @author Sean A. Irvine
 */
public class A058094 extends LinearRecurrence {

  /** Construct the sequence. */
  public A058094() {
    super(new long[] {1, -4, -4, 9, -11, 6}, new long[] {1, 1, 2, 5, 14, 42});
  }
}
