package irvine.oeis.a051;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A051528 Molien series for group G_{1,2} of order 384.
 * @author Sean A. Irvine
 */
public class A051528 extends LinearRecurrence {

  /** Construct the sequence. */
  public A051528() {
    super(new long[] {-1, 1, 0, 0, 2, -2, 1, -1, -1, 1, -2, 2, 0, 0, 1}, new long[] {1, 0, 0, 0, 4, 2, 3, 2, 11, 7, 11, 9, 25, 18, 27});
  }
}
