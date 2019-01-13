package irvine.oeis.a122;

import irvine.oeis.LinearRecurrence;

/**
 * A122519.
 * @author Sean A. Irvine
 */
public class A122519 extends LinearRecurrence {

  /** Construct the sequence. */
  public A122519() {
    super(new long[] {1, 1, 1, 0, 0}, new long[] {1, 1, 1, 1, 1});
  }
}
