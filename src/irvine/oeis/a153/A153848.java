package irvine.oeis.a153;

import irvine.oeis.LinearRecurrence;

/**
 * A153848.
 * @author Sean A. Irvine
 */
public class A153848 extends LinearRecurrence {

  /** Construct the sequence. */
  public A153848() {
    super(new long[] {-100, 101}, new long[] {21, 2121});
  }
}
