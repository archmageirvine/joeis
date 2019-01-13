package irvine.oeis.a237;

import irvine.oeis.LinearRecurrence;

/**
 * A237617.
 * @author Sean A. Irvine
 */
public class A237617 extends LinearRecurrence {

  /** Construct the sequence. */
  public A237617() {
    super(new long[] {-1, 4, -6, 4}, new long[] {0, 1, 20, 74});
  }
}
