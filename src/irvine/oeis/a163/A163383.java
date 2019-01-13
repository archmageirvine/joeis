package irvine.oeis.a163;

import irvine.oeis.LinearRecurrence;

/**
 * A163383.
 * @author Sean A. Irvine
 */
public class A163383 extends LinearRecurrence {

  /** Construct the sequence. */
  public A163383() {
    super(new long[] {4, -8, 5}, new long[] {-1, 3, 15});
  }
}
