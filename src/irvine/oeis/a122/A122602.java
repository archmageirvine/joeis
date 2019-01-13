package irvine.oeis.a122;

import irvine.oeis.LinearRecurrence;

/**
 * A122602.
 * @author Sean A. Irvine
 */
public class A122602 extends LinearRecurrence {

  /** Construct the sequence. */
  public A122602() {
    super(new long[] {1, 5, -15, -20, 35, 21, -28, -8, 9, 1}, new long[] {1, 0, 0, 0, 0, 0, 0, 0, 0, 0});
  }
}
