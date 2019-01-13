package irvine.oeis.a275;

import irvine.oeis.LinearRecurrence;

/**
 * A275441.
 * @author Sean A. Irvine
 */
public class A275441 extends LinearRecurrence {

  /** Construct the sequence. */
  public A275441() {
    super(new long[] {1, 1, -3, -2, 0, -2, 3, 1}, new long[] {0, 0, 0, 0, 2, 2, 6, 8});
  }
}
