package irvine.oeis.a275;

import irvine.oeis.LinearRecurrence;

/**
 * A275856.
 * @author Sean A. Irvine
 */
public class A275856 extends LinearRecurrence {

  /** Construct the sequence. */
  public A275856() {
    super(new long[] {-1, 0, 1, -3, 4}, new long[] {1, 1, 3, 8, 24});
  }
}
