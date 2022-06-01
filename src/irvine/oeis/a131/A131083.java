package irvine.oeis.a131;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A131083 Periodic sequence (26, 16, 6, 2, 6, 16, 26, 30).
 * @author Sean A. Irvine
 */
public class A131083 extends LinearRecurrence {

  /** Construct the sequence. */
  public A131083() {
    super(new long[] {1, -1, 0, 0, 1}, new long[] {26, 16, 6, 2, 6});
  }
}
