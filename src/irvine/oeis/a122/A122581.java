package irvine.oeis.a122;

import irvine.oeis.LinearRecurrence;

/**
 * A122581.
 * @author Sean A. Irvine
 */
public class A122581 extends LinearRecurrence {

  /** Construct the sequence. */
  public A122581() {
    super(new long[] {2, -4, 1, -2, 1}, new long[] {1, 1, 1, 1, 1});
  }
}
