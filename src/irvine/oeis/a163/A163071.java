package irvine.oeis.a163;

import irvine.oeis.LinearRecurrence;

/**
 * A163071.
 * @author Sean A. Irvine
 */
public class A163071 extends LinearRecurrence {

  /** Construct the sequence. */
  public A163071() {
    super(new long[] {-4, 6}, new long[] {4, 17});
  }
}
