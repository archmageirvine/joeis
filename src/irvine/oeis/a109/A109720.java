package irvine.oeis.a109;

import irvine.oeis.LinearRecurrence;

/**
 * A109720 Periodic sequence {0,1,1,1,1,1,1} or n^6 mod 7.
 * @author Sean A. Irvine
 */
public class A109720 extends LinearRecurrence {

  /** Construct the sequence. */
  public A109720() {
    super(new long[] {1, 0, 0, 0, 0, 0, 0}, new long[] {0, 1, 1, 1, 1, 1, 1});
  }
}
