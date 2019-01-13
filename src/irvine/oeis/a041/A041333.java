package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041333.
 * @author Sean A. Irvine
 */
public class A041333 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041333() {
    super(new long[] {-1, 0, 0, 0, 322, 0, 0, 0}, new long[] {1, 2, 5, 12, 317, 646, 1609, 3864});
  }
}
