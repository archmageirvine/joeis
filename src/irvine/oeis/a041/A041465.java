package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041465.
 * @author Sean A. Irvine
 */
public class A041465 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041465() {
    super(new long[] {-1, 0, 0, 0, 126, 0, 0, 0}, new long[] {1, 1, 3, 4, 123, 127, 377, 504});
  }
}
