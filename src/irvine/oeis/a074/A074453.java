package irvine.oeis.a074;

import irvine.oeis.LinearRecurrence;

/**
 * A074453.
 * @author Sean A. Irvine
 */
public class A074453 extends LinearRecurrence {

  /** Construct the sequence. */
  public A074453() {
    super(new long[] {1, 1, 2, 2, -2, 1}, new long[] {6, 1, -3, 1, 17, 16});
  }
}
