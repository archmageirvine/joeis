package irvine.oeis.a111;

import irvine.oeis.LinearRecurrence;

/**
 * A111955.
 * @author Sean A. Irvine
 */
public class A111955 extends LinearRecurrence {

  /** Construct the sequence. */
  public A111955() {
    super(new long[] {1, 3, 1}, new long[] {0, 1, 4});
  }
}
