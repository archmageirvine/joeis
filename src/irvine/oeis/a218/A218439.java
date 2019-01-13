package irvine.oeis.a218;

import irvine.oeis.LinearRecurrence;

/**
 * A218439.
 * @author Sean A. Irvine
 */
public class A218439 extends LinearRecurrence {

  /** Construct the sequence. */
  public A218439() {
    super(new long[] {-1, -1, 1, 3, 1, 1}, new long[] {1, 1, 16, 25, 36, 100});
  }
}
