package irvine.oeis.a181;

import irvine.oeis.LinearRecurrence;

/**
 * A181287.
 * @author Sean A. Irvine
 */
public class A181287 extends LinearRecurrence {

  /** Construct the sequence. */
  public A181287() {
    super(new long[] {-5, 5, 0, 0, 1}, new long[] {0, 1, 2, 3, 4});
  }
}
