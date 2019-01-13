package irvine.oeis.a234;

import irvine.oeis.LinearRecurrence;

/**
 * A234267.
 * @author Sean A. Irvine
 */
public class A234267 extends LinearRecurrence {

  /** Construct the sequence. */
  public A234267() {
    super(new long[] {-2, 13, -16, 7}, new long[] {1, 6, 26, 99});
  }
}
