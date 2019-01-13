package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037617.
 * @author Sean A. Irvine
 */
public class A037617 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037617() {
    super(new long[] {-10, 1, 0, 10}, new long[] {1, 13, 132, 1321});
  }
}
