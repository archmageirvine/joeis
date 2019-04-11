package irvine.oeis.a131;

import irvine.oeis.LinearRecurrence;

/**
 * A131029 Periodic sequence <code>(11, 5, 2, 5, 11, 14)</code>.
 * @author Sean A. Irvine
 */
public class A131029 extends LinearRecurrence {

  /** Construct the sequence. */
  public A131029() {
    super(new long[] {1, -2, 2}, new long[] {11, 5, 2});
  }
}
