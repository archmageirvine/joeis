package irvine.oeis.a140;

import irvine.oeis.LinearRecurrence;

/**
 * A140205.
 * @author Sean A. Irvine
 */
public class A140205 extends LinearRecurrence {

  /** Construct the sequence. */
  public A140205() {
    super(new long[] {-1, 1, 0, 0, 0, 0, 0, 0, 1}, new long[] {0, 1, 2, 4, 5, 7, 9, 12, 12});
  }
}
