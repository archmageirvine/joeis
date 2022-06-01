package irvine.oeis.a190;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A190277 Number of trails between opposite vertices in a triangle strip.
 * @author Sean A. Irvine
 */
public class A190277 extends LinearRecurrence {

  /** Construct the sequence. */
  public A190277() {
    super(new long[] {-2, -3, 1, 3}, new long[] {1, 1, 2, 4});
  }
}
