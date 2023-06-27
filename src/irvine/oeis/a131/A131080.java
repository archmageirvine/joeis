package irvine.oeis.a131;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A131080 Periodic sequence (4, 4, 3, 1, 0, 0, 1, 3).
 * @author Sean A. Irvine
 */
public class A131080 extends LinearRecurrence {

  /** Construct the sequence. */
  public A131080() {
    super(1, new long[] {1, -1, 0, 0, 1}, new long[] {4, 4, 3, 1, 0});
  }
}
