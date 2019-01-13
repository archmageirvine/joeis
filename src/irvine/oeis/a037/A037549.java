package irvine.oeis.a037;

import irvine.oeis.LinearRecurrence;

/**
 * A037549.
 * @author Sean A. Irvine
 */
public class A037549 extends LinearRecurrence {

  /** Construct the sequence. */
  public A037549() {
    super(new long[] {-8, 1, 0, 8}, new long[] {1, 10, 82, 657});
  }
}
