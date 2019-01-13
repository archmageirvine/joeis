package irvine.oeis.a122;

import irvine.oeis.LinearRecurrence;

/**
 * A122299.
 * @author Sean A. Irvine
 */
public class A122299 extends LinearRecurrence {

  /** Construct the sequence. */
  public A122299() {
    super(new long[] {-1, 3, 2}, new long[] {0, 1, 1});
  }
}
