package irvine.oeis.a131;

import irvine.oeis.LinearRecurrence;

/**
 * A131081 Periodic sequence <code>(8, 7, 4, 1, 0, 1, 4, 7)</code>.
 * @author Sean A. Irvine
 */
public class A131081 extends LinearRecurrence {

  /** Construct the sequence. */
  public A131081() {
    super(new long[] {1, -1, 0, 0, 1}, new long[] {8, 7, 4, 1, 0});
  }
}
