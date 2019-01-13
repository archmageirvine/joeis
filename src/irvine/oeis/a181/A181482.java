package irvine.oeis.a181;

import irvine.oeis.LinearRecurrence;

/**
 * A181482.
 * @author Sean A. Irvine
 */
public class A181482 extends LinearRecurrence {

  /** Construct the sequence. */
  public A181482() {
    super(new long[] {1, -1, 0, -2, 2, 0, 1}, new long[] {1, 3, 0, 4, 9, 3, 10});
  }
}
