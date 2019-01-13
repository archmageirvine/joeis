package irvine.oeis.a225;

import irvine.oeis.LinearRecurrence;

/**
 * A225500.
 * @author Sean A. Irvine
 */
public class A225500 extends LinearRecurrence {

  /** Construct the sequence. */
  public A225500() {
    super(new long[] {-1, 1, 0, 0, 0, 1, -1, 1, 0, 0, 0, 1}, new long[] {1, 1, 1, 1, 1, 2, 2, 3, 4, 5, 7, 9});
  }
}
