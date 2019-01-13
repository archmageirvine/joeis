package irvine.oeis.a181;

import irvine.oeis.LinearRecurrence;

/**
 * A181288.
 * @author Sean A. Irvine
 */
public class A181288 extends LinearRecurrence {

  /** Construct the sequence. */
  public A181288() {
    super(new long[] {-6, 6, 0, 0, 0, 1}, new long[] {0, 1, 2, 3, 4, 5});
  }
}
