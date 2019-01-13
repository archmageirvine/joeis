package irvine.oeis.a122;

import irvine.oeis.LinearRecurrence;

/**
 * A122582.
 * @author Sean A. Irvine
 */
public class A122582 extends LinearRecurrence {

  /** Construct the sequence. */
  public A122582() {
    super(new long[] {1, -2, 1, -2, 1}, new long[] {1, 1, 1, 1, 1});
  }
}
