package irvine.oeis.a122;

import irvine.oeis.LinearRecurrence;

/**
 * A122607.
 * @author Sean A. Irvine
 */
public class A122607 extends LinearRecurrence {

  /** Construct the sequence. */
  public A122607() {
    super(new long[] {1, 3, 6, 4, -5, 1}, new long[] {1, 1, 1, 1, 1, 1});
  }
}
