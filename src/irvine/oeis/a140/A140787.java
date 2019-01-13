package irvine.oeis.a140;

import irvine.oeis.LinearRecurrence;

/**
 * A140787.
 * @author Sean A. Irvine
 */
public class A140787 extends LinearRecurrence {

  /** Construct the sequence. */
  public A140787() {
    super(new long[] {-8, -4, 6, 1}, new long[] {1, 1, 7, 9});
  }
}
