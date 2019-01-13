package irvine.oeis.a122;

import irvine.oeis.LinearRecurrence;

/**
 * A122006.
 * @author Sean A. Irvine
 */
public class A122006 extends LinearRecurrence {

  /** Construct the sequence. */
  public A122006() {
    super(new long[] {-9, 3, 3}, new long[] {0, 1, 2});
  }
}
