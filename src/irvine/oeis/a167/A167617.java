package irvine.oeis.a167;

import irvine.oeis.LinearRecurrence;

/**
 * A167617.
 * @author Sean A. Irvine
 */
public class A167617 extends LinearRecurrence {

  /** Construct the sequence. */
  public A167617() {
    super(new long[] {-2, -3, -3, -3, -3, -3}, new long[] {0, 0, 3, -6, 10, -21});
  }
}
