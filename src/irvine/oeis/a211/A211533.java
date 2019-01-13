package irvine.oeis.a211;

import irvine.oeis.LinearRecurrence;

/**
 * A211533.
 * @author Sean A. Irvine
 */
public class A211533 extends LinearRecurrence {

  /** Construct the sequence. */
  public A211533() {
    super(new long[] {1, -1, 0, -1, 1, -1, 1, 0, 1}, new long[] {0, 0, 1, 1, 3, 4, 5, 8, 10});
  }
}
