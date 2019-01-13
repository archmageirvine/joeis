package irvine.oeis.a122;

import irvine.oeis.LinearRecurrence;

/**
 * A122595.
 * @author Sean A. Irvine
 */
public class A122595 extends LinearRecurrence {

  /** Construct the sequence. */
  public A122595() {
    super(new long[] {1, -1, -1, 3}, new long[] {1, 3, 8, 20});
  }
}
