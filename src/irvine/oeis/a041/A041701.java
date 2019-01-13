package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041701.
 * @author Sean A. Irvine
 */
public class A041701 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041701() {
    super(new long[] {1, 0, 0, 654, 0, 0}, new long[] {1, 4, 17, 650, 2617, 11118});
  }
}
