package irvine.oeis.a275;

import irvine.oeis.LinearRecurrence;

/**
 * A275857.
 * @author Sean A. Irvine
 */
public class A275857 extends LinearRecurrence {

  /** Construct the sequence. */
  public A275857() {
    super(new long[] {-1, 0, 1, -3, 4}, new long[] {1, 2, 6, 18, 56});
  }
}
