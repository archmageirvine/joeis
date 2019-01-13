package irvine.oeis.a042;

import irvine.oeis.LinearRecurrence;

/**
 * A042497.
 * @author Sean A. Irvine
 */
public class A042497 extends LinearRecurrence {

  /** Construct the sequence. */
  public A042497() {
    super(new long[] {-1, 0, 0, 0, 390, 0, 0, 0}, new long[] {1, 1, 6, 7, 384, 391, 2339, 2730});
  }
}
