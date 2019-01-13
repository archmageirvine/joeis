package irvine.oeis.a122;

import irvine.oeis.LinearRecurrence;

/**
 * A122997.
 * @author Sean A. Irvine
 */
public class A122997 extends LinearRecurrence {

  /** Construct the sequence. */
  public A122997() {
    super(new long[] {1, 1, 1, 1, 1}, new long[] {1, -1, 1, -1, 1});
  }
}
