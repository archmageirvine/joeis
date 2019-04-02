package irvine.oeis.a177;

import irvine.oeis.LinearRecurrence;

/**
 * A177071 (7n + 3)(7n + 4).
 * @author Sean A. Irvine
 */
public class A177071 extends LinearRecurrence {

  /** Construct the sequence. */
  public A177071() {
    super(new long[] {1, -3, 3}, new long[] {12, 110, 306});
  }
}
