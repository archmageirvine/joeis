package irvine.oeis.a300;

import irvine.oeis.LinearRecurrence;

/**
 * A300760.
 * @author Sean A. Irvine
 */
public class A300760 extends LinearRecurrence {

  /** Construct the sequence. */
  public A300760() {
    super(new long[] {1, -2, 0, 1, 0, 2, -2, 0, -1, 0, 2}, new long[] {0, 1, 4, 10, 25, 51, 98, 165, 267, 407, 601});
  }
}
