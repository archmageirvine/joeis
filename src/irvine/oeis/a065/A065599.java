package irvine.oeis.a065;

import irvine.oeis.LinearRecurrence;

/**
 * A065599.
 * @author Sean A. Irvine
 */
public class A065599 extends LinearRecurrence {

  /** Construct the sequence. */
  public A065599() {
    super(new long[] {1, 0, -3, 0, 3, 0}, new long[] {0, 1, 2, 9, 4, 25});
  }
}
