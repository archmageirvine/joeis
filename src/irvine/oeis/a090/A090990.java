package irvine.oeis.a090;

import irvine.oeis.LinearRecurrence;

/**
 * A090990.
 * @author Sean A. Irvine
 */
public class A090990 extends LinearRecurrence {

  /** Construct the sequence. */
  public A090990() {
    super(new long[] {-1, 2, 1}, new long[] {5, 9, 16});
  }
}
