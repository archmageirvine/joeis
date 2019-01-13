package irvine.oeis.a047;

import irvine.oeis.LinearRecurrence;

/**
 * A047432.
 * @author Sean A. Irvine
 */
public class A047432 extends LinearRecurrence {

  /** Construct the sequence. */
  public A047432() {
    super(new long[] {-1, 1, 0, 0, 0, 1}, new long[] {0, 1, 4, 5, 6, 8});
  }
}
