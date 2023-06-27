package irvine.oeis.a274;

import irvine.oeis.recur.LinearRecurrence;

/**
 * A274978 Integers of the form m*(m + 6)/7.
 * @author Sean A. Irvine
 */
public class A274978 extends LinearRecurrence {

  /** Construct the sequence. */
  public A274978() {
    super(1, new long[] {1, -1, -2, 2, 1}, new long[] {0, 1, 13, 16, 40});
  }
}
