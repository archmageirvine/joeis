package irvine.oeis.a131;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A131082 Periodic sequence (15, 11, 5, 1, 1, 5, 11, 15).
 * @author Sean A. Irvine
 */
public class A131082 extends LinearRecurrence {

  /** Construct the sequence. */
  public A131082() {
    super(1, new long[] {1, -1, 0, 0, 1}, new long[] {15, 11, 5, 1, 1});
  }
}
