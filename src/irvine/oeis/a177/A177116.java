package irvine.oeis.a177;

import irvine.oeis.LinearRecurrence;

/**
 * A177116.
 * @author Sean A. Irvine
 */
public class A177116 extends LinearRecurrence {

  /** Construct the sequence. */
  public A177116() {
    super(new long[] {-1, 3, -3, 1, 0, 0, 0, 0, 0, 0, 0, 1, -3, 3}, new long[] {0, 0, 0, 1, 2, 4, 7, 11, 17, 24, 33, 44, 57, 72});
  }
}
