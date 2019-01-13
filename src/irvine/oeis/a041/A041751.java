package irvine.oeis.a041;

import irvine.oeis.LinearRecurrence;

/**
 * A041751.
 * @author Sean A. Irvine
 */
public class A041751 extends LinearRecurrence {

  /** Construct the sequence. */
  public A041751() {
    super(new long[] {-1, 0, 0, 0, 318, 0, 0, 0}, new long[] {1, 1, 7, 8, 311, 319, 2225, 2544});
  }
}
