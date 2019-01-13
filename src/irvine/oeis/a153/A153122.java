package irvine.oeis.a153;

import irvine.oeis.LinearRecurrence;

/**
 * A153122.
 * @author Sean A. Irvine
 */
public class A153122 extends LinearRecurrence {

  /** Construct the sequence. */
  public A153122() {
    super(new long[] {1, -2, 1, 2, -2}, new long[] {1, -2, 6, -15, 38});
  }
}
