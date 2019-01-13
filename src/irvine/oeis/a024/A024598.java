package irvine.oeis.a024;

import irvine.oeis.LinearRecurrence;

/**
 * A024598.
 * @author Sean A. Irvine
 */
public class A024598 extends LinearRecurrence {

  /** Construct the sequence. */
  public A024598() {
    super(new long[] {-1, 1, 3, -3, -3, 3, 1}, new long[] {1, 3, 14, 22, 55, 73, 140});
  }
}
