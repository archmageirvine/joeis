package irvine.oeis.a139;

import irvine.oeis.LinearRecurrence;

/**
 * A139763.
 * @author Sean A. Irvine
 */
public class A139763 extends LinearRecurrence {

  /** Construct the sequence. */
  public A139763() {
    super(new long[] {2, 1, 1, 1}, new long[] {1, 2, 3, 4});
  }
}
