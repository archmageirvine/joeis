package irvine.oeis.a131;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A131081 Periodic sequence (8, 7, 4, 1, 0, 1, 4, 7).
 * @author Sean A. Irvine
 */
public class A131081 extends LinearRecurrence {

  /** Construct the sequence. */
  public A131081() {
    super(1, new long[] {1, -1, 0, 0, 1}, new long[] {8, 7, 4, 1, 0});
  }
}
