package irvine.oeis.a131;

import irvine.oeis.LinearRecurrence;

/**
 * A131079 Periodic sequence (2, 2, 2, 1, 0, 0, 0, 1).
 * @author Sean A. Irvine
 */
public class A131079 extends LinearRecurrence {

  /** Construct the sequence. */
  public A131079() {
    super(new long[] {1, -1, 0, 0, 1}, new long[] {2, 2, 2, 1, 0});
  }
}
