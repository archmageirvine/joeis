package irvine.oeis.a058;

import irvine.oeis.LinearRecurrence;

/**
 * A058923.
 * @author Sean A. Irvine
 */
public class A058923 extends LinearRecurrence {

  /** Construct the sequence. */
  public A058923() {
    super(new long[] {1, -5, 10, -10, 5}, new long[] {1, 1, 0, -2, -4});
  }
}
