package irvine.oeis.a139;

import irvine.oeis.LinearRecurrence;

/**
 * A139790.
 * @author Sean A. Irvine
 */
public class A139790 extends LinearRecurrence {

  /** Construct the sequence. */
  public A139790() {
    super(new long[] {-4, 0, 3}, new long[] {1, 2, 3});
  }
}
