package irvine.oeis.a087;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A087279 Nonnegative numbers such that distance to nearest positive square equals exactly 1.
 * @author Sean A. Irvine
 */
public class A087279 extends LinearRecurrence {

  /** Construct the sequence. */
  public A087279() {
    super(new long[] {1, -1, -2, 2, 1}, new long[] {0, 2, 3, 5, 8});
  }
}
