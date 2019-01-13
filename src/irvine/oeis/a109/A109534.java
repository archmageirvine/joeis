package irvine.oeis.a109;

import irvine.oeis.LinearRecurrence;

/**
 * A109534.
 * @author Sean A. Irvine
 */
public class A109534 extends LinearRecurrence {

  /** Construct the sequence. */
  public A109534() {
    super(new long[] {-1, 0, 1, 0, 1, 0}, new long[] {1, 2, 4, 5, 9, 6});
  }
}
