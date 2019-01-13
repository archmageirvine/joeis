package irvine.oeis.a275;

import irvine.oeis.LinearRecurrence;

/**
 * A275861.
 * @author Sean A. Irvine
 */
public class A275861 extends LinearRecurrence {

  /** Construct the sequence. */
  public A275861() {
    super(new long[] {-1, 3, -3, -3, 5, -7, 7}, new long[] {1, 1, 9, 51, 305, 1813, 10784});
  }
}
