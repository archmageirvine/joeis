package irvine.oeis.a058;

import irvine.oeis.LinearRecurrence;

/**
 * A058187.
 * @author Sean A. Irvine
 */
public class A058187 extends LinearRecurrence {

  /** Construct the sequence. */
  public A058187() {
    super(new long[] {-1, 1, 3, -3, -3, 3, 1}, new long[] {1, 1, 4, 4, 10, 10, 20});
  }
}
