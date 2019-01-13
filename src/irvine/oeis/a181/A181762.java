package irvine.oeis.a181;

import irvine.oeis.LinearRecurrence;

/**
 * A181762.
 * @author Sean A. Irvine
 */
public class A181762 extends LinearRecurrence {

  /** Construct the sequence. */
  public A181762() {
    super(new long[] {-1, 0, 2, 0}, new long[] {0, 8, 1, 14});
  }
}
