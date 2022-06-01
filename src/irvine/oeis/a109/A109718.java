package irvine.oeis.a109;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A109718 Periodic sequence with period {0,1,0,3}, or n^3 mod 4.
 * @author Sean A. Irvine
 */
public class A109718 extends LinearRecurrence {

  /** Construct the sequence. */
  public A109718() {
    super(new long[] {1, 0, 0, 0}, new long[] {0, 1, 0, 3});
  }
}
